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

import com.liferay.docs.librito.model.Librto;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Librto. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author liferay
 * @see LibrtoLocalServiceUtil
 * @see com.liferay.docs.librito.service.base.LibrtoLocalServiceBaseImpl
 * @see com.liferay.docs.librito.service.impl.LibrtoLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface LibrtoLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LibrtoLocalServiceUtil} to access the librto local service. Add custom service methods to {@link com.liferay.docs.librito.service.impl.LibrtoLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Librto addGuestbook(long userId, java.lang.String name,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Adds the librto to the database. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Librto addLibrto(Librto librto);

	/**
	* Creates a new librto with the primary key. Does not add the librto to the database.
	*
	* @param guestbookId the primary key for the new librto
	* @return the new librto
	*/
	public Librto createLibrto(long guestbookId);

	public Librto deleteGuestbook(long guestbookId,
		ServiceContext serviceContext) throws PortalException, SystemException;

	/**
	* Deletes the librto from the database. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Librto deleteLibrto(Librto librto);

	/**
	* Deletes the librto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto that was removed
	* @throws PortalException if a librto with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Librto deleteLibrto(long guestbookId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Librto fetchLibrto(long guestbookId);

	/**
	* Returns the librto matching the UUID and group.
	*
	* @param uuid the librto's UUID
	* @param groupId the primary key of the group
	* @return the matching librto, or <code>null</code> if a matching librto could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Librto fetchLibrtoByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the librto with the primary key.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto
	* @throws PortalException if a librto with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Librto getLibrto(long guestbookId) throws PortalException;

	/**
	* Returns the librto matching the UUID and group.
	*
	* @param uuid the librto's UUID
	* @param groupId the primary key of the group
	* @return the matching librto
	* @throws PortalException if a matching librto could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Librto getLibrtoByUuidAndGroupId(java.lang.String uuid, long groupId)
		throws PortalException;

	public Librto updateGuestbook(long userId, long guestbookId,
		java.lang.String name, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	* Updates the librto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param librto the librto
	* @return the librto that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Librto updateLibrto(Librto librto);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGuestbooksCount(long groupId);

	/**
	* Returns the number of librtos.
	*
	* @return the number of librtos
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLibrtosCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Librto> getGuestbooks(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Librto> getGuestbooks(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Librto> getGuestbooks(long groupId, int start, int end,
		OrderByComparator<Librto> obc);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Librto> getLibrtos(int start, int end);

	/**
	* Returns all the librtos matching the UUID and company.
	*
	* @param uuid the UUID of the librtos
	* @param companyId the primary key of the company
	* @return the matching librtos, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Librto> getLibrtosByUuidAndCompanyId(java.lang.String uuid,
		long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Librto> getLibrtosByUuidAndCompanyId(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}