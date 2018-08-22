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

package com.liferay.docs.librito.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Librto}.
 * </p>
 *
 * @author liferay
 * @see Librto
 * @generated
 */
@ProviderType
public class LibrtoWrapper implements Librto, ModelWrapper<Librto> {
	public LibrtoWrapper(Librto librto) {
		_librto = librto;
	}

	@Override
	public Class<?> getModelClass() {
		return Librto.class;
	}

	@Override
	public String getModelClassName() {
		return Librto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("guestbookId", getGuestbookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public Librto toEscapedModel() {
		return new LibrtoWrapper(_librto.toEscapedModel());
	}

	@Override
	public Librto toUnescapedModel() {
		return new LibrtoWrapper(_librto.toUnescapedModel());
	}

	/**
	* Returns <code>true</code> if this librto is approved.
	*
	* @return <code>true</code> if this librto is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _librto.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _librto.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this librto is denied.
	*
	* @return <code>true</code> if this librto is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _librto.isDenied();
	}

	/**
	* Returns <code>true</code> if this librto is a draft.
	*
	* @return <code>true</code> if this librto is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _librto.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _librto.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this librto is expired.
	*
	* @return <code>true</code> if this librto is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _librto.isExpired();
	}

	/**
	* Returns <code>true</code> if this librto is inactive.
	*
	* @return <code>true</code> if this librto is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _librto.isInactive();
	}

	/**
	* Returns <code>true</code> if this librto is incomplete.
	*
	* @return <code>true</code> if this librto is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _librto.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _librto.isNew();
	}

	/**
	* Returns <code>true</code> if this librto is pending.
	*
	* @return <code>true</code> if this librto is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _librto.isPending();
	}

	/**
	* Returns <code>true</code> if this librto is scheduled.
	*
	* @return <code>true</code> if this librto is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _librto.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _librto.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Librto> toCacheModel() {
		return _librto.toCacheModel();
	}

	@Override
	public int compareTo(Librto librto) {
		return _librto.compareTo(librto);
	}

	/**
	* Returns the status of this librto.
	*
	* @return the status of this librto
	*/
	@Override
	public int getStatus() {
		return _librto.getStatus();
	}

	@Override
	public int hashCode() {
		return _librto.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _librto.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LibrtoWrapper((Librto)_librto.clone());
	}

	/**
	* Returns the name of this librto.
	*
	* @return the name of this librto
	*/
	@Override
	public java.lang.String getName() {
		return _librto.getName();
	}

	/**
	* Returns the status by user name of this librto.
	*
	* @return the status by user name of this librto
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _librto.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this librto.
	*
	* @return the status by user uuid of this librto
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _librto.getStatusByUserUuid();
	}

	/**
	* Returns the user name of this librto.
	*
	* @return the user name of this librto
	*/
	@Override
	public java.lang.String getUserName() {
		return _librto.getUserName();
	}

	/**
	* Returns the user uuid of this librto.
	*
	* @return the user uuid of this librto
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _librto.getUserUuid();
	}

	/**
	* Returns the uuid of this librto.
	*
	* @return the uuid of this librto
	*/
	@Override
	public java.lang.String getUuid() {
		return _librto.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _librto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _librto.toXmlString();
	}

	/**
	* Returns the create date of this librto.
	*
	* @return the create date of this librto
	*/
	@Override
	public Date getCreateDate() {
		return _librto.getCreateDate();
	}

	/**
	* Returns the modified date of this librto.
	*
	* @return the modified date of this librto
	*/
	@Override
	public Date getModifiedDate() {
		return _librto.getModifiedDate();
	}

	/**
	* Returns the status date of this librto.
	*
	* @return the status date of this librto
	*/
	@Override
	public Date getStatusDate() {
		return _librto.getStatusDate();
	}

	/**
	* Returns the company ID of this librto.
	*
	* @return the company ID of this librto
	*/
	@Override
	public long getCompanyId() {
		return _librto.getCompanyId();
	}

	/**
	* Returns the group ID of this librto.
	*
	* @return the group ID of this librto
	*/
	@Override
	public long getGroupId() {
		return _librto.getGroupId();
	}

	/**
	* Returns the guestbook ID of this librto.
	*
	* @return the guestbook ID of this librto
	*/
	@Override
	public long getGuestbookId() {
		return _librto.getGuestbookId();
	}

	/**
	* Returns the primary key of this librto.
	*
	* @return the primary key of this librto
	*/
	@Override
	public long getPrimaryKey() {
		return _librto.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this librto.
	*
	* @return the status by user ID of this librto
	*/
	@Override
	public long getStatusByUserId() {
		return _librto.getStatusByUserId();
	}

	/**
	* Returns the user ID of this librto.
	*
	* @return the user ID of this librto
	*/
	@Override
	public long getUserId() {
		return _librto.getUserId();
	}

	@Override
	public void persist() {
		_librto.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_librto.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this librto.
	*
	* @param companyId the company ID of this librto
	*/
	@Override
	public void setCompanyId(long companyId) {
		_librto.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this librto.
	*
	* @param createDate the create date of this librto
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_librto.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_librto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_librto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_librto.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this librto.
	*
	* @param groupId the group ID of this librto
	*/
	@Override
	public void setGroupId(long groupId) {
		_librto.setGroupId(groupId);
	}

	/**
	* Sets the guestbook ID of this librto.
	*
	* @param guestbookId the guestbook ID of this librto
	*/
	@Override
	public void setGuestbookId(long guestbookId) {
		_librto.setGuestbookId(guestbookId);
	}

	/**
	* Sets the modified date of this librto.
	*
	* @param modifiedDate the modified date of this librto
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_librto.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this librto.
	*
	* @param name the name of this librto
	*/
	@Override
	public void setName(java.lang.String name) {
		_librto.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_librto.setNew(n);
	}

	/**
	* Sets the primary key of this librto.
	*
	* @param primaryKey the primary key of this librto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_librto.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_librto.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this librto.
	*
	* @param status the status of this librto
	*/
	@Override
	public void setStatus(int status) {
		_librto.setStatus(status);
	}

	/**
	* Sets the status by user ID of this librto.
	*
	* @param statusByUserId the status by user ID of this librto
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_librto.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this librto.
	*
	* @param statusByUserName the status by user name of this librto
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_librto.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this librto.
	*
	* @param statusByUserUuid the status by user uuid of this librto
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_librto.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this librto.
	*
	* @param statusDate the status date of this librto
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_librto.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this librto.
	*
	* @param userId the user ID of this librto
	*/
	@Override
	public void setUserId(long userId) {
		_librto.setUserId(userId);
	}

	/**
	* Sets the user name of this librto.
	*
	* @param userName the user name of this librto
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_librto.setUserName(userName);
	}

	/**
	* Sets the user uuid of this librto.
	*
	* @param userUuid the user uuid of this librto
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_librto.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this librto.
	*
	* @param uuid the uuid of this librto
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_librto.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LibrtoWrapper)) {
			return false;
		}

		LibrtoWrapper librtoWrapper = (LibrtoWrapper)obj;

		if (Objects.equals(_librto, librtoWrapper._librto)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _librto.getStagedModelType();
	}

	@Override
	public Librto getWrappedModel() {
		return _librto;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _librto.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _librto.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_librto.resetOriginalValues();
	}

	private final Librto _librto;
}