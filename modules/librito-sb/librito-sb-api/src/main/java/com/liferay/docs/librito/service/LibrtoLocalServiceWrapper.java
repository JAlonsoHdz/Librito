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

package com.liferay.docs.librito.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LibrtoLocalService}.
 *
 * @author liferay
 * @see LibrtoLocalService
 * @generated
 */
@ProviderType
public class LibrtoLocalServiceWrapper implements LibrtoLocalService,
	ServiceWrapper<LibrtoLocalService> {
	public LibrtoLocalServiceWrapper(LibrtoLocalService librtoLocalService) {
		_librtoLocalService = librtoLocalService;
	}

	@Override
	public com.liferay.docs.librito.model.Librto addGuestbook(long userId,
		java.lang.String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _librtoLocalService.addGuestbook(userId, name, serviceContext);
	}

	/**
	* Adds the librto to the database. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was added
	*/
	@Override
	public com.liferay.docs.librito.model.Librto addLibrto(
		com.liferay.docs.librito.model.Librto librto) {
		return _librtoLocalService.addLibrto(librto);
	}

	/**
	* Creates a new librto with the primary key. Does not add the librto to the database.
	*
	* @param guestbookId the primary key for the new librto
	* @return the new librto
	*/
	@Override
	public com.liferay.docs.librito.model.Librto createLibrto(long guestbookId) {
		return _librtoLocalService.createLibrto(guestbookId);
	}

	@Override
	public com.liferay.docs.librito.model.Librto deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _librtoLocalService.deleteGuestbook(guestbookId, serviceContext);
	}

	/**
	* Deletes the librto from the database. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was removed
	*/
	@Override
	public com.liferay.docs.librito.model.Librto deleteLibrto(
		com.liferay.docs.librito.model.Librto librto) {
		return _librtoLocalService.deleteLibrto(librto);
	}

	/**
	* Deletes the librto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto that was removed
	* @throws PortalException if a librto with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.librito.model.Librto deleteLibrto(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _librtoLocalService.deleteLibrto(guestbookId);
	}

	@Override
	public com.liferay.docs.librito.model.Librto fetchLibrto(long guestbookId) {
		return _librtoLocalService.fetchLibrto(guestbookId);
	}

	/**
	* Returns the librto matching the UUID and group.
	*
	* @param uuid the librto's UUID
	* @param groupId the primary key of the group
	* @return the matching librto, or <code>null</code> if a matching librto could not be found
	*/
	@Override
	public com.liferay.docs.librito.model.Librto fetchLibrtoByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _librtoLocalService.fetchLibrtoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the librto with the primary key.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto
	* @throws PortalException if a librto with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.librito.model.Librto getLibrto(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _librtoLocalService.getLibrto(guestbookId);
	}

	/**
	* Returns the librto matching the UUID and group.
	*
	* @param uuid the librto's UUID
	* @param groupId the primary key of the group
	* @return the matching librto
	* @throws PortalException if a matching librto could not be found
	*/
	@Override
	public com.liferay.docs.librito.model.Librto getLibrtoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _librtoLocalService.getLibrtoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.docs.librito.model.Librto updateGuestbook(long userId,
		long guestbookId, java.lang.String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _librtoLocalService.updateGuestbook(userId, guestbookId, name,
			serviceContext);
	}

	/**
	* Updates the librto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was updated
	*/
	@Override
	public com.liferay.docs.librito.model.Librto updateLibrto(
		com.liferay.docs.librito.model.Librto librto) {
		return _librtoLocalService.updateLibrto(librto);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _librtoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _librtoLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _librtoLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _librtoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _librtoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _librtoLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return _librtoLocalService.getGuestbooksCount(groupId);
	}

	/**
	* Returns the number of librtos.
	*
	* @return the number of librtos
	*/
	@Override
	public int getLibrtosCount() {
		return _librtoLocalService.getLibrtosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _librtoLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _librtoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.librito.model.impl.LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _librtoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.librito.model.impl.LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _librtoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.docs.librito.model.Librto> getGuestbooks(
		long groupId) {
		return _librtoLocalService.getGuestbooks(groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.librito.model.Librto> getGuestbooks(
		long groupId, int start, int end) {
		return _librtoLocalService.getGuestbooks(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.librito.model.Librto> getGuestbooks(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.librito.model.Librto> obc) {
		return _librtoLocalService.getGuestbooks(groupId, start, end, obc);
	}

	/**
	* Returns a range of all the librtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.librito.model.impl.LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @return the range of librtos
	*/
	@Override
	public java.util.List<com.liferay.docs.librito.model.Librto> getLibrtos(
		int start, int end) {
		return _librtoLocalService.getLibrtos(start, end);
	}

	/**
	* Returns all the librtos matching the UUID and company.
	*
	* @param uuid the UUID of the librtos
	* @param companyId the primary key of the company
	* @return the matching librtos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.docs.librito.model.Librto> getLibrtosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _librtoLocalService.getLibrtosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of librtos matching the UUID and company.
	*
	* @param uuid the UUID of the librtos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching librtos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.docs.librito.model.Librto> getLibrtosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.librito.model.Librto> orderByComparator) {
		return _librtoLocalService.getLibrtosByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _librtoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _librtoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public LibrtoLocalService getWrappedService() {
		return _librtoLocalService;
	}

	@Override
	public void setWrappedService(LibrtoLocalService librtoLocalService) {
		_librtoLocalService = librtoLocalService;
	}

	private LibrtoLocalService _librtoLocalService;
}