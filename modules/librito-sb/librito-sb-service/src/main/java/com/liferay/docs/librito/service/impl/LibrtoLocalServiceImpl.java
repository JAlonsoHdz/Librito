/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.librito.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.docs.librito.exception.GuestbookNameException;
import com.liferay.docs.librito.model.Entry;
import com.liferay.docs.librito.model.Librto;
import com.liferay.docs.librito.service.base.LibrtoLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the librto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.librito.service.LibrtoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see LibrtoLocalServiceBaseImpl
 * @see com.liferay.docs.librito.service.LibrtoLocalServiceUtil
 */
public class LibrtoLocalServiceImpl extends LibrtoLocalServiceBaseImpl {
	public Librto addGuestbook(
		    long userId, String name, ServiceContext serviceContext)
		    throws PortalException {

		    long groupId = serviceContext.getScopeGroupId();

		    User user = userLocalService.getUserById(userId);

		    Date now = new Date();

		    validate(name);

		    long guestbookId = counterLocalService.increment();

		    Librto guestbook = librtoPersistence.create(guestbookId);

		    guestbook.setUuid(serviceContext.getUuid());
		    guestbook.setUserId(userId);
		    guestbook.setGroupId(groupId);
		    guestbook.setCompanyId(user.getCompanyId());
		    guestbook.setUserName(user.getFullName());
		    guestbook.setCreateDate(serviceContext.getCreateDate(now));
		    guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		    guestbook.setName(name);
		    guestbook.setExpandoBridgeAttributes(serviceContext);

		    librtoPersistence.update(guestbook);

		    return guestbook;

		}
	
		public Librto updateGuestbook(long userId, long guestbookId,
		    String name, ServiceContext serviceContext) throws PortalException,
		                SystemException {

		        Date now = new Date();

		        validate(name);

		        Librto guestbook = getLibrto(guestbookId);

		        User user = userLocalService.getUser(userId);

		        guestbook.setUserId(userId);
		        guestbook.setUserName(user.getFullName());
		        guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		        guestbook.setName(name);
		        guestbook.setExpandoBridgeAttributes(serviceContext);

		        librtoPersistence.update(guestbook);

		        return guestbook;
		}
		
		public Librto deleteGuestbook(long guestbookId,
                ServiceContext serviceContext) throws PortalException,
                SystemException {

		Librto guestbook = getLibrto(guestbookId);

        List<Entry> entries = entryLocalService.getEntries(
                        serviceContext.getScopeGroupId(), guestbookId);

        for (Entry entry : entries) {
                entryLocalService.deleteEntry(entry.getEntryId());
        }

        guestbook = deleteLibrto(guestbook);

        return guestbook;
}
	
		public List<Librto> getGuestbooks(long groupId) {
	
		    return librtoPersistence.findByGroupId(groupId);
		}
	
		public List<Librto> getGuestbooks(long groupId, int start, int end, 
		    OrderByComparator<Librto> obc) {
	
		    return librtoPersistence.findByGroupId(groupId, start, end, obc);
		}
	
		public List<Librto> getGuestbooks(long groupId, int start, int end) {
	
		    return librtoPersistence.findByGroupId(groupId, start, end);
		}
	
		public int getGuestbooksCount(long groupId) {
	
		    return librtoPersistence.countByGroupId(groupId);
		}
		
		protected void validate(String name) throws PortalException {
		    if (Validator.isNull(name)) {
		        throw new GuestbookNameException();
		    }
		}
}
