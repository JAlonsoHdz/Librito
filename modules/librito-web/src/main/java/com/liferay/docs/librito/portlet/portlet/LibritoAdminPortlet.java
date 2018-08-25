package com.liferay.docs.librito.portlet.portlet;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.docs.librito.model.Librto;
import com.liferay.docs.librito.portlet.constants.LibritoPortletKeys;
import com.liferay.docs.librito.service.LibrtoLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import javax.portlet.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	    immediate = true,
	    property = {
	            "com.liferay.portlet.display-category=category.hidden",
	            "com.liferay.portlet.scopeable=true",
	            "javax.portlet.display-name=Librito Admin",
	            "javax.portlet.expiration-cache=0",
	            "javax.portlet.init-param.portlet-title-based-navigation=true",
	            "javax.portlet.init-param.template-path=/",
	            "javax.portlet.init-param.view-template=/libritoadminportlet/view.jsp",
	            "javax.portlet.name=" + LibritoPortletKeys.LIBRITO_ADMIN,
	            "javax.portlet.resource-bundle=content.Language",
	            "javax.portlet.security-role-ref=administrator",
	            "javax.portlet.supports.mime-type=text/html",
	            "com.liferay.portlet.add-default-resource=true"
	    },
	    service = Portlet.class
	)
public class LibritoAdminPortlet extends MVCPortlet {
	public void addGuestbook(ActionRequest request, ActionResponse response)
		    throws PortalException {

		    ServiceContext serviceContext = ServiceContextFactory.getInstance(
		        Librto.class.getName(), request);

		    String name = ParamUtil.getString(request, "name");

		    try {
		    	_libritoLocalService.addGuestbook(
		            serviceContext.getUserId(), name, serviceContext);
		    }
		    catch (PortalException pe) {

		        Logger.getLogger(LibritoAdminPortlet.class.getName()).log(
		            Level.SEVERE, null, pe);

		        response.setRenderParameter(
		            "mvcPath", "/libritoadminportlet/edit_librito.jsp");
		    }
		}
	
		public void updateGuestbook(ActionRequest request, ActionResponse response)
		    throws PortalException {

		    ServiceContext serviceContext = ServiceContextFactory.getInstance(
		        Librto.class.getName(), request);

		    String name = ParamUtil.getString(request, "name");
		    long guestbookId = ParamUtil.getLong(request, "guestbookId");

		    try {
		    	_libritoLocalService.updateGuestbook(
		            serviceContext.getUserId(), guestbookId, name, serviceContext);

		    } catch (PortalException pe) {

		        Logger.getLogger(LibritoAdminPortlet.class.getName()).log(
		            Level.SEVERE, null, pe);

		        response.setRenderParameter(
		            "mvcPath", "/libritoadminportlet/edit_librito.jsp");
		    }
		}
		
		public void deleteGuestbook(ActionRequest request, ActionResponse response)
			    throws PortalException {

			    ServiceContext serviceContext = ServiceContextFactory.getInstance(
			        Librto.class.getName(), request);

			    long guestbookId = ParamUtil.getLong(request, "guestbookId");

			    try {
			    	_libritoLocalService.deleteGuestbook(guestbookId, serviceContext);
			    }
			    catch (PortalException pe) {

			        Logger.getLogger(LibritoAdminPortlet.class.getName()).log(
			            Level.SEVERE, null, pe);
			    }
		}

		private LibrtoLocalService _libritoLocalService;

		@Reference(unbind = "-")
		protected void setGuestbookService(LibrtoLocalService guestbookLocalService) {
			_libritoLocalService = guestbookLocalService;
		}
}
