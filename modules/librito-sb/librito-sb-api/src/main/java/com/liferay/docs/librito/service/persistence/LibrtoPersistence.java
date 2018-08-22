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

package com.liferay.docs.librito.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.librito.exception.NoSuchLibrtoException;
import com.liferay.docs.librito.model.Librto;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the librto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.librito.service.persistence.impl.LibrtoPersistenceImpl
 * @see LibrtoUtil
 * @generated
 */
@ProviderType
public interface LibrtoPersistence extends BasePersistence<Librto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LibrtoUtil} to access the librto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the librtos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching librtos
	*/
	public java.util.List<Librto> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the librtos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @return the range of matching librtos
	*/
	public java.util.List<Librto> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the librtos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching librtos
	*/
	public java.util.List<Librto> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns an ordered range of all the librtos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching librtos
	*/
	public java.util.List<Librto> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first librto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Returns the first librto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the last librto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Returns the last librto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the librtos before and after the current librto in the ordered set where uuid = &#63;.
	*
	* @param guestbookId the primary key of the current librto
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next librto
	* @throws NoSuchLibrtoException if a librto with the primary key could not be found
	*/
	public Librto[] findByUuid_PrevAndNext(long guestbookId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Removes all the librtos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of librtos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching librtos
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the librto where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLibrtoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLibrtoException;

	/**
	* Returns the librto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the librto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the librto where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the librto that was removed
	*/
	public Librto removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLibrtoException;

	/**
	* Returns the number of librtos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching librtos
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the librtos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching librtos
	*/
	public java.util.List<Librto> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the librtos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @return the range of matching librtos
	*/
	public java.util.List<Librto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the librtos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching librtos
	*/
	public java.util.List<Librto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns an ordered range of all the librtos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching librtos
	*/
	public java.util.List<Librto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first librto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Returns the first librto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the last librto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Returns the last librto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the librtos before and after the current librto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param guestbookId the primary key of the current librto
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next librto
	* @throws NoSuchLibrtoException if a librto with the primary key could not be found
	*/
	public Librto[] findByUuid_C_PrevAndNext(long guestbookId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Removes all the librtos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of librtos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching librtos
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the librtos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching librtos
	*/
	public java.util.List<Librto> findByGroupId(long groupId);

	/**
	* Returns a range of all the librtos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @return the range of matching librtos
	*/
	public java.util.List<Librto> findByGroupId(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the librtos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching librtos
	*/
	public java.util.List<Librto> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns an ordered range of all the librtos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching librtos
	*/
	public java.util.List<Librto> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first librto in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Returns the first librto in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the last librto in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching librto
	* @throws NoSuchLibrtoException if a matching librto could not be found
	*/
	public Librto findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Returns the last librto in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching librto, or <code>null</code> if a matching librto could not be found
	*/
	public Librto fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns the librtos before and after the current librto in the ordered set where groupId = &#63;.
	*
	* @param guestbookId the primary key of the current librto
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next librto
	* @throws NoSuchLibrtoException if a librto with the primary key could not be found
	*/
	public Librto[] findByGroupId_PrevAndNext(long guestbookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator)
		throws NoSuchLibrtoException;

	/**
	* Removes all the librtos where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of librtos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching librtos
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the librto in the entity cache if it is enabled.
	*
	* @param librto the librto
	*/
	public void cacheResult(Librto librto);

	/**
	* Caches the librtos in the entity cache if it is enabled.
	*
	* @param librtos the librtos
	*/
	public void cacheResult(java.util.List<Librto> librtos);

	/**
	* Creates a new librto with the primary key. Does not add the librto to the database.
	*
	* @param guestbookId the primary key for the new librto
	* @return the new librto
	*/
	public Librto create(long guestbookId);

	/**
	* Removes the librto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto that was removed
	* @throws NoSuchLibrtoException if a librto with the primary key could not be found
	*/
	public Librto remove(long guestbookId) throws NoSuchLibrtoException;

	public Librto updateImpl(Librto librto);

	/**
	* Returns the librto with the primary key or throws a {@link NoSuchLibrtoException} if it could not be found.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto
	* @throws NoSuchLibrtoException if a librto with the primary key could not be found
	*/
	public Librto findByPrimaryKey(long guestbookId)
		throws NoSuchLibrtoException;

	/**
	* Returns the librto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the librto
	* @return the librto, or <code>null</code> if a librto with the primary key could not be found
	*/
	public Librto fetchByPrimaryKey(long guestbookId);

	@Override
	public java.util.Map<java.io.Serializable, Librto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the librtos.
	*
	* @return the librtos
	*/
	public java.util.List<Librto> findAll();

	/**
	* Returns a range of all the librtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @return the range of librtos
	*/
	public java.util.List<Librto> findAll(int start, int end);

	/**
	* Returns an ordered range of all the librtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of librtos
	*/
	public java.util.List<Librto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator);

	/**
	* Returns an ordered range of all the librtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibrtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of librtos
	* @param end the upper bound of the range of librtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of librtos
	*/
	public java.util.List<Librto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Librto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the librtos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of librtos.
	*
	* @return the number of librtos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}