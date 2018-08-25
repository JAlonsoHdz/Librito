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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Librto. This utility wraps
 * {@link com.liferay.docs.librito.service.impl.LibrtoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see LibrtoLocalService
 * @see com.liferay.docs.librito.service.base.LibrtoLocalServiceBaseImpl
 * @see com.liferay.docs.librito.service.impl.LibrtoLocalServiceImpl
 * @generated
 */
@ProviderType
public class LibrtoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.librito.service.impl.LibrtoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.docs.librito.model.Librto addGuestbook(
		long userId, java.lang.String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addGuestbook(userId, name, serviceContext);
	}

	/**
	* Adds the librto to the database. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was added
	*/
	public static com.liferay.docs.librito.model.Librto addLibrto(
		com.liferay.docs.librito.model.Librto librto) {
		return getService().addLibrto(librto);
	}

	/**
	* Creates a new librto with the primary key. Does not add the librto to the database.
	*
	* @param guestbookId the primary key for the new librto
	* @return the new librto
	*/
	public static com.liferay.docs.librito.model.Librto createLibrto(
		long guestbookId) {
		return getService().createLibrto(guestbookId);
	}

	public static com.liferay.docs.librito.model.Librto deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteGuestbook(guestbookId, serviceContext);
	}

	/**
	* Deletes the librto from the database. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was removed
	*/
	public static com.liferay.docs.librito.model.Librto deleteLibrto(
		com.liferay.docs.librito.model.Librto librto) {
		return getService().deleteLibrto(librto);
	}

	/**
	* Deletes the librto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto that was removed
	* @throws PortalException if a librto with the primary key could not be found
	*/
	public static com.liferay.docs.librito.model.Librto deleteLibrto(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteLibrto(guestbookId);
	}

	public static com.liferay.docs.librito.model.Librto fetchLibrto(
		long guestbookId) {
		return getService().fetchLibrto(guestbookId);
	}

	/**
	* Returns the librto matching the UUID and group.
	*
	* @param uuid the librto's UUID
	* @param groupId the primary key of the group
	* @return the matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public static com.liferay.docs.librito.model.Librto fetchLibrtoByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchLibrtoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the librto with the primary key.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto
	* @throws PortalException if a librto with the primary key could not be found
	*/
	public static com.liferay.docs.librito.model.Librto getLibrto(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLibrto(guestbookId);
	}

	/**
	* Returns the librto matching the UUID and group.
	*
	* @param uuid the librto's UUID
	* @param groupId the primary key of the group
	* @return the matching librto
	* @throws PortalException if a matching librto could not be found
	*/
	public static com.liferay.docs.librito.model.Librto getLibrtoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLibrtoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.docs.librito.model.Librto updateGuestbook(
		long userId, long guestbookId, java.lang.String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateGuestbook(userId, guestbookId, name, serviceContext);
	}

	/**
	* Updates the librto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was updated
	*/
	public static com.liferay.docs.librito.model.Librto updateLibrto(
		com.liferay.docs.librito.model.Librto librto) {
		return getService().updateLibrto(librto);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static int getGuestbooksCount(long groupId) {
		return getService().getGuestbooksCount(groupId);
	}

	/**
	* Returns the number of librtos.
	*
	* @return the number of librtos
	*/
	public static int getLibrtosCount() {
		return getService().getLibrtosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.docs.librito.model.Librto> getGuestbooks(
		long groupId) {
		return getService().getGuestbooks(groupId);
	}

	public static java.util.List<com.liferay.docs.librito.model.Librto> getGuestbooks(
		long groupId, int start, int end) {
		return getService().getGuestbooks(groupId, start, end);
	}

	public static java.util.List<com.liferay.docs.librito.model.Librto> getGuestbooks(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.librito.model.Librto> obc) {
		return getService().getGuestbooks(groupId, start, end, obc);
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
	public static java.util.List<com.liferay.docs.librito.model.Librto> getLibrtos(
		int start, int end) {
		return getService().getLibrtos(start, end);
	}

	/**
	* Returns all the librtos matching the UUID and company.
	*
	* @param uuid the UUID of the librtos
	* @param companyId the primary key of the company
	* @return the matching librtos, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.docs.librito.model.Librto> getLibrtosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getLibrtosByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.liferay.docs.librito.model.Librto> getLibrtosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.librito.model.Librto> orderByComparator) {
		return getService()
				   .getLibrtosByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static LibrtoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LibrtoLocalService, LibrtoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(LibrtoLocalService.class);
}