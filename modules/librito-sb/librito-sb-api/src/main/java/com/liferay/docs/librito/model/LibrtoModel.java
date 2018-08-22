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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Librto service. Represents a row in the &quot;LB_Librto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.librito.model.impl.LibrtoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.librito.model.impl.LibrtoImpl}.
 * </p>
 *
 * @author liferay
 * @see Librto
 * @see com.liferay.docs.librito.model.impl.LibrtoImpl
 * @see com.liferay.docs.librito.model.impl.LibrtoModelImpl
 * @generated
 */
@ProviderType
public interface LibrtoModel extends BaseModel<Librto>, GroupedModel,
	ShardedModel, StagedAuditedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a librto model instance should use the {@link Librto} interface instead.
	 */

	/**
	 * Returns the primary key of this librto.
	 *
	 * @return the primary key of this librto
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this librto.
	 *
	 * @param primaryKey the primary key of this librto
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this librto.
	 *
	 * @return the uuid of this librto
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this librto.
	 *
	 * @param uuid the uuid of this librto
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the guestbook ID of this librto.
	 *
	 * @return the guestbook ID of this librto
	 */
	public long getGuestbookId();

	/**
	 * Sets the guestbook ID of this librto.
	 *
	 * @param guestbookId the guestbook ID of this librto
	 */
	public void setGuestbookId(long guestbookId);

	/**
	 * Returns the group ID of this librto.
	 *
	 * @return the group ID of this librto
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this librto.
	 *
	 * @param groupId the group ID of this librto
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this librto.
	 *
	 * @return the company ID of this librto
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this librto.
	 *
	 * @param companyId the company ID of this librto
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this librto.
	 *
	 * @return the user ID of this librto
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this librto.
	 *
	 * @param userId the user ID of this librto
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this librto.
	 *
	 * @return the user uuid of this librto
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this librto.
	 *
	 * @param userUuid the user uuid of this librto
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this librto.
	 *
	 * @return the user name of this librto
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this librto.
	 *
	 * @param userName the user name of this librto
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this librto.
	 *
	 * @return the create date of this librto
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this librto.
	 *
	 * @param createDate the create date of this librto
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this librto.
	 *
	 * @return the modified date of this librto
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this librto.
	 *
	 * @param modifiedDate the modified date of this librto
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this librto.
	 *
	 * @return the status of this librto
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this librto.
	 *
	 * @param status the status of this librto
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this librto.
	 *
	 * @return the status by user ID of this librto
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this librto.
	 *
	 * @param statusByUserId the status by user ID of this librto
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this librto.
	 *
	 * @return the status by user uuid of this librto
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this librto.
	 *
	 * @param statusByUserUuid the status by user uuid of this librto
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this librto.
	 *
	 * @return the status by user name of this librto
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this librto.
	 *
	 * @param statusByUserName the status by user name of this librto
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this librto.
	 *
	 * @return the status date of this librto
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this librto.
	 *
	 * @param statusDate the status date of this librto
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the name of this librto.
	 *
	 * @return the name of this librto
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this librto.
	 *
	 * @param name the name of this librto
	 */
	public void setName(String name);

	/**
	 * Returns <code>true</code> if this librto is approved.
	 *
	 * @return <code>true</code> if this librto is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this librto is denied.
	 *
	 * @return <code>true</code> if this librto is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this librto is a draft.
	 *
	 * @return <code>true</code> if this librto is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this librto is expired.
	 *
	 * @return <code>true</code> if this librto is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this librto is inactive.
	 *
	 * @return <code>true</code> if this librto is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this librto is incomplete.
	 *
	 * @return <code>true</code> if this librto is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this librto is pending.
	 *
	 * @return <code>true</code> if this librto is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this librto is scheduled.
	 *
	 * @return <code>true</code> if this librto is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Librto librto);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Librto> toCacheModel();

	@Override
	public Librto toEscapedModel();

	@Override
	public Librto toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}