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

package com.resume.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Resume service. Represents a row in the &quot;resume_Resume&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.resume.model.impl.ResumeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.resume.model.impl.ResumeImpl}.
 * </p>
 *
 * @author Artyom
 * @see Resume
 * @see com.resume.model.impl.ResumeImpl
 * @see com.resume.model.impl.ResumeModelImpl
 * @generated
 */
public interface ResumeModel extends BaseModel<Resume>, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a resume model instance should use the {@link Resume} interface instead.
	 */

	/**
	 * Returns the primary key of this resume.
	 *
	 * @return the primary key of this resume
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this resume.
	 *
	 * @param primaryKey the primary key of this resume
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this resume.
	 *
	 * @return the uuid of this resume
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this resume.
	 *
	 * @param uuid the uuid of this resume
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the resume ID of this resume.
	 *
	 * @return the resume ID of this resume
	 */
	public long getResumeId();

	/**
	 * Sets the resume ID of this resume.
	 *
	 * @param resumeId the resume ID of this resume
	 */
	public void setResumeId(long resumeId);

	/**
	 * Returns the resume date of this resume.
	 *
	 * @return the resume date of this resume
	 */
	public Date getResumeDate();

	/**
	 * Sets the resume date of this resume.
	 *
	 * @param resumeDate the resume date of this resume
	 */
	public void setResumeDate(Date resumeDate);

	/**
	 * Returns the resume text of this resume.
	 *
	 * @return the resume text of this resume
	 */
	@AutoEscape
	public String getResumeText();

	/**
	 * Sets the resume text of this resume.
	 *
	 * @param resumeText the resume text of this resume
	 */
	public void setResumeText(String resumeText);

	/**
	 * Returns the status of this resume.
	 *
	 * @return the status of this resume
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this resume.
	 *
	 * @param status the status of this resume
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this resume.
	 *
	 * @return the status by user ID of this resume
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this resume.
	 *
	 * @param statusByUserId the status by user ID of this resume
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this resume.
	 *
	 * @return the status by user uuid of this resume
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this resume.
	 *
	 * @param statusByUserUuid the status by user uuid of this resume
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this resume.
	 *
	 * @return the status by user name of this resume
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this resume.
	 *
	 * @param statusByUserName the status by user name of this resume
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this resume.
	 *
	 * @return the status date of this resume
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this resume.
	 *
	 * @param statusDate the status date of this resume
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the company ID of this resume.
	 *
	 * @return the company ID of this resume
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this resume.
	 *
	 * @param companyId the company ID of this resume
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this resume.
	 *
	 * @return the group ID of this resume
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this resume.
	 *
	 * @param groupId the group ID of this resume
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this resume.
	 *
	 * @return the user ID of this resume
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this resume.
	 *
	 * @param userId the user ID of this resume
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this resume.
	 *
	 * @return the user uuid of this resume
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this resume.
	 *
	 * @param userUuid the user uuid of this resume
	 */
	public void setUserUuid(String userUuid);

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this resume is approved.
	 *
	 * @return <code>true</code> if this resume is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this resume is denied.
	 *
	 * @return <code>true</code> if this resume is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this resume is a draft.
	 *
	 * @return <code>true</code> if this resume is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this resume is expired.
	 *
	 * @return <code>true</code> if this resume is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this resume is inactive.
	 *
	 * @return <code>true</code> if this resume is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this resume is incomplete.
	 *
	 * @return <code>true</code> if this resume is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this resume is pending.
	 *
	 * @return <code>true</code> if this resume is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this resume is scheduled.
	 *
	 * @return <code>true</code> if this resume is scheduled; <code>false</code> otherwise
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
	public int compareTo(Resume resume);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Resume> toCacheModel();

	@Override
	public Resume toEscapedModel();

	@Override
	public Resume toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}