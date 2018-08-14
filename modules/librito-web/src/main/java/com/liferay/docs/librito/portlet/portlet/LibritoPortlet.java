package com.liferay.docs.librito.portlet.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.osgi.service.component.annotations.Component;

import com.liferay.docs.librito.model.Entry;
import com.liferay.docs.librito.portlet.constants.LibritoPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author hejesus
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=librito-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LibritoPortletKeys.Librito,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LibritoPortlet extends MVCPortlet {
	public void addEntry(ActionRequest request, ActionResponse response) {
		try {
	        PortletPreferences prefs = request.getPreferences();

	        String[] guestbookEntries = prefs.getValues("librito-entries",
	                new String[1]);

	        ArrayList<String> entries = new ArrayList<String>();

	        if (guestbookEntries[0] != null) {
	            entries = new ArrayList<String>(Arrays.asList(prefs.getValues(
	                    "librito-entries", new String[1])));
	        }

	        String userName = ParamUtil.getString(request, "name");
	        String message = ParamUtil.getString(request, "message");
	        String entry = userName + "^" + message;

	        entries.add(entry);

	        String[] array = entries.toArray(new String[entries.size()]);

	        prefs.setValues("librito-entries", array);

	        try {
	            prefs.store();
	        }
	        catch (IOException ex) {
	            Logger.getLogger(LibritoPortlet.class.getName()).log(
	                    Level.SEVERE, null, ex);
	        }
	        catch (ValidatorException ex) {
	            Logger.getLogger(LibritoPortlet.class.getName()).log(
	                    Level.SEVERE, null, ex);
	        }

	    }
	    catch (ReadOnlyException ex) {
	        Logger.getLogger(LibritoPortlet.class.getName()).log(
	                Level.SEVERE, null, ex);
	    }
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	    throws PortletException, IOException {

	    PortletPreferences prefs = renderRequest.getPreferences();
	    String[] guestbookEntries = prefs.getValues("librito-entries", new String[1]);

	    if (guestbookEntries[0] != null) {
	        List<Entry> entries = parseEntries(guestbookEntries);
	        renderRequest.setAttribute("entries", entries);
	    }

	    super.render(renderRequest, renderResponse);
	}
	
	private List<Entry> parseEntries(String[] guestbookEntries) {
	    List<Entry> entries = new ArrayList<Entry>();

	    for (String entry : guestbookEntries) {
	        String[] parts = entry.split("\\^", 2);
	        Entry gbEntry = new Entry(parts[0], parts[1]);
	        entries.add(gbEntry);
	    }

	    return entries;
	}
}