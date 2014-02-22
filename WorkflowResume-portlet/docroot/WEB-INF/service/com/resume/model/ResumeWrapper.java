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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Resume}.
 * </p>
 *
 * @author Artyom
 * @see Resume
 * @generated
 */
public class ResumeWrapper implements Resume, ModelWrapper<Resume> {
	public ResumeWrapper(Resume resume) {
		_resume = resume;
	}

	@Override
	public Class<?> getModelClass() {
		return Resume.class;
	}

	@Override
	public String getModelClassName() {
		return Resume.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("resumeId", getResumeId());
		attributes.put("resumeDate", getResumeDate());
		attributes.put("resumeText", getResumeText());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long resumeId = (Long)attributes.get("resumeId");

		if (resumeId != null) {
			setResumeId(resumeId);
		}

		Date resumeDate = (Date)attributes.get("resumeDate");

		if (resumeDate != null) {
			setResumeDate(resumeDate);
		}

		String resumeText = (String)attributes.get("resumeText");

		if (resumeText != null) {
			setResumeText(resumeText);
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

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this resume.
	*
	* @return the primary key of this resume
	*/
	@Override
	public long getPrimaryKey() {
		return _resume.getPrimaryKey();
	}

	/**
	* Sets the primary key of this resume.
	*
	* @param primaryKey the primary key of this resume
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resume.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this resume.
	*
	* @return the uuid of this resume
	*/
	@Override
	public java.lang.String getUuid() {
		return _resume.getUuid();
	}

	/**
	* Sets the uuid of this resume.
	*
	* @param uuid the uuid of this resume
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_resume.setUuid(uuid);
	}

	/**
	* Returns the resume ID of this resume.
	*
	* @return the resume ID of this resume
	*/
	@Override
	public long getResumeId() {
		return _resume.getResumeId();
	}

	/**
	* Sets the resume ID of this resume.
	*
	* @param resumeId the resume ID of this resume
	*/
	@Override
	public void setResumeId(long resumeId) {
		_resume.setResumeId(resumeId);
	}

	/**
	* Returns the resume date of this resume.
	*
	* @return the resume date of this resume
	*/
	@Override
	public java.util.Date getResumeDate() {
		return _resume.getResumeDate();
	}

	/**
	* Sets the resume date of this resume.
	*
	* @param resumeDate the resume date of this resume
	*/
	@Override
	public void setResumeDate(java.util.Date resumeDate) {
		_resume.setResumeDate(resumeDate);
	}

	/**
	* Returns the resume text of this resume.
	*
	* @return the resume text of this resume
	*/
	@Override
	public java.lang.String getResumeText() {
		return _resume.getResumeText();
	}

	/**
	* Sets the resume text of this resume.
	*
	* @param resumeText the resume text of this resume
	*/
	@Override
	public void setResumeText(java.lang.String resumeText) {
		_resume.setResumeText(resumeText);
	}

	/**
	* Returns the status of this resume.
	*
	* @return the status of this resume
	*/
	@Override
	public int getStatus() {
		return _resume.getStatus();
	}

	/**
	* Sets the status of this resume.
	*
	* @param status the status of this resume
	*/
	@Override
	public void setStatus(int status) {
		_resume.setStatus(status);
	}

	/**
	* Returns the status by user ID of this resume.
	*
	* @return the status by user ID of this resume
	*/
	@Override
	public long getStatusByUserId() {
		return _resume.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this resume.
	*
	* @param statusByUserId the status by user ID of this resume
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_resume.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this resume.
	*
	* @return the status by user uuid of this resume
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resume.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this resume.
	*
	* @param statusByUserUuid the status by user uuid of this resume
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_resume.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this resume.
	*
	* @return the status by user name of this resume
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _resume.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this resume.
	*
	* @param statusByUserName the status by user name of this resume
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_resume.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this resume.
	*
	* @return the status date of this resume
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _resume.getStatusDate();
	}

	/**
	* Sets the status date of this resume.
	*
	* @param statusDate the status date of this resume
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_resume.setStatusDate(statusDate);
	}

	/**
	* Returns the company ID of this resume.
	*
	* @return the company ID of this resume
	*/
	@Override
	public long getCompanyId() {
		return _resume.getCompanyId();
	}

	/**
	* Sets the company ID of this resume.
	*
	* @param companyId the company ID of this resume
	*/
	@Override
	public void setCompanyId(long companyId) {
		_resume.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this resume.
	*
	* @return the group ID of this resume
	*/
	@Override
	public long getGroupId() {
		return _resume.getGroupId();
	}

	/**
	* Sets the group ID of this resume.
	*
	* @param groupId the group ID of this resume
	*/
	@Override
	public void setGroupId(long groupId) {
		_resume.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this resume.
	*
	* @return the user ID of this resume
	*/
	@Override
	public long getUserId() {
		return _resume.getUserId();
	}

	/**
	* Sets the user ID of this resume.
	*
	* @param userId the user ID of this resume
	*/
	@Override
	public void setUserId(long userId) {
		_resume.setUserId(userId);
	}

	/**
	* Returns the user uuid of this resume.
	*
	* @return the user uuid of this resume
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resume.getUserUuid();
	}

	/**
	* Sets the user uuid of this resume.
	*
	* @param userUuid the user uuid of this resume
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_resume.setUserUuid(userUuid);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _resume.getApproved();
	}

	/**
	* Returns <code>true</code> if this resume is approved.
	*
	* @return <code>true</code> if this resume is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _resume.isApproved();
	}

	/**
	* Returns <code>true</code> if this resume is denied.
	*
	* @return <code>true</code> if this resume is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _resume.isDenied();
	}

	/**
	* Returns <code>true</code> if this resume is a draft.
	*
	* @return <code>true</code> if this resume is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _resume.isDraft();
	}

	/**
	* Returns <code>true</code> if this resume is expired.
	*
	* @return <code>true</code> if this resume is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _resume.isExpired();
	}

	/**
	* Returns <code>true</code> if this resume is inactive.
	*
	* @return <code>true</code> if this resume is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _resume.isInactive();
	}

	/**
	* Returns <code>true</code> if this resume is incomplete.
	*
	* @return <code>true</code> if this resume is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _resume.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this resume is pending.
	*
	* @return <code>true</code> if this resume is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _resume.isPending();
	}

	/**
	* Returns <code>true</code> if this resume is scheduled.
	*
	* @return <code>true</code> if this resume is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _resume.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _resume.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resume.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resume.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resume.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resume.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resume.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resume.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resume.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resume.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resume.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resume.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResumeWrapper((Resume)_resume.clone());
	}

	@Override
	public int compareTo(com.resume.model.Resume resume) {
		return _resume.compareTo(resume);
	}

	@Override
	public int hashCode() {
		return _resume.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.resume.model.Resume> toCacheModel() {
		return _resume.toCacheModel();
	}

	@Override
	public com.resume.model.Resume toEscapedModel() {
		return new ResumeWrapper(_resume.toEscapedModel());
	}

	@Override
	public com.resume.model.Resume toUnescapedModel() {
		return new ResumeWrapper(_resume.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resume.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resume.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resume.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResumeWrapper)) {
			return false;
		}

		ResumeWrapper resumeWrapper = (ResumeWrapper)obj;

		if (Validator.equals(_resume, resumeWrapper._resume)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Resume getWrappedResume() {
		return _resume;
	}

	@Override
	public Resume getWrappedModel() {
		return _resume;
	}

	@Override
	public void resetOriginalValues() {
		_resume.resetOriginalValues();
	}

	private Resume _resume;
}