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

package com.liferay.docs.librito.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.librito.model.Librto;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Librto in entity cache.
 *
 * @author liferay
 * @see Librto
 * @generated
 */
@ProviderType
public class LibrtoCacheModel implements CacheModel<Librto>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LibrtoCacheModel)) {
			return false;
		}

		LibrtoCacheModel librtoCacheModel = (LibrtoCacheModel)obj;

		if (guestbookId == librtoCacheModel.guestbookId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, guestbookId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Librto toEntityModel() {
		LibrtoImpl librtoImpl = new LibrtoImpl();

		if (uuid == null) {
			librtoImpl.setUuid(StringPool.BLANK);
		}
		else {
			librtoImpl.setUuid(uuid);
		}

		librtoImpl.setGuestbookId(guestbookId);
		librtoImpl.setGroupId(groupId);
		librtoImpl.setCompanyId(companyId);
		librtoImpl.setUserId(userId);

		if (userName == null) {
			librtoImpl.setUserName(StringPool.BLANK);
		}
		else {
			librtoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			librtoImpl.setCreateDate(null);
		}
		else {
			librtoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			librtoImpl.setModifiedDate(null);
		}
		else {
			librtoImpl.setModifiedDate(new Date(modifiedDate));
		}

		librtoImpl.setStatus(status);
		librtoImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			librtoImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			librtoImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			librtoImpl.setStatusDate(null);
		}
		else {
			librtoImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			librtoImpl.setName(StringPool.BLANK);
		}
		else {
			librtoImpl.setName(name);
		}

		librtoImpl.resetOriginalValues();

		return librtoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		guestbookId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(guestbookId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public String uuid;
	public long guestbookId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
}