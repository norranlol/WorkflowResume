/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.resume.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.resume.model.Resume;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Resume in entity cache.
 *
 * @author Artyom
 * @see Resume
 * @generated
 */
public class ResumeCacheModel implements CacheModel<Resume>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", resumeId=");
		sb.append(resumeId);
		sb.append(", resumeDate=");
		sb.append(resumeDate);
		sb.append(", resumeText=");
		sb.append(resumeText);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Resume toEntityModel() {
		ResumeImpl resumeImpl = new ResumeImpl();

		if (uuid == null) {
			resumeImpl.setUuid(StringPool.BLANK);
		}
		else {
			resumeImpl.setUuid(uuid);
		}

		resumeImpl.setResumeId(resumeId);

		if (resumeDate == Long.MIN_VALUE) {
			resumeImpl.setResumeDate(null);
		}
		else {
			resumeImpl.setResumeDate(new Date(resumeDate));
		}

		if (resumeText == null) {
			resumeImpl.setResumeText(StringPool.BLANK);
		}
		else {
			resumeImpl.setResumeText(resumeText);
		}

		resumeImpl.setStatus(status);
		resumeImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			resumeImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			resumeImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			resumeImpl.setStatusDate(null);
		}
		else {
			resumeImpl.setStatusDate(new Date(statusDate));
		}

		resumeImpl.setCompanyId(companyId);
		resumeImpl.setGroupId(groupId);
		resumeImpl.setUserId(userId);

		resumeImpl.resetOriginalValues();

		return resumeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		resumeId = objectInput.readLong();
		resumeDate = objectInput.readLong();
		resumeText = objectInput.readUTF();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
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

		objectOutput.writeLong(resumeId);
		objectOutput.writeLong(resumeDate);

		if (resumeText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resumeText);
		}

		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
	}

	public String uuid;
	public long resumeId;
	public long resumeDate;
	public String resumeText;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public long companyId;
	public long groupId;
	public long userId;
}