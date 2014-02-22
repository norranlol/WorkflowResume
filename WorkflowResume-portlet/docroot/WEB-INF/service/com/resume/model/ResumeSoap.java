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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Artyom
 * @generated
 */
public class ResumeSoap implements Serializable {
	public static ResumeSoap toSoapModel(Resume model) {
		ResumeSoap soapModel = new ResumeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setResumeId(model.getResumeId());
		soapModel.setResumeDate(model.getResumeDate());
		soapModel.setResumeText(model.getResumeText());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static ResumeSoap[] toSoapModels(Resume[] models) {
		ResumeSoap[] soapModels = new ResumeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResumeSoap[][] toSoapModels(Resume[][] models) {
		ResumeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResumeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResumeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResumeSoap[] toSoapModels(List<Resume> models) {
		List<ResumeSoap> soapModels = new ArrayList<ResumeSoap>(models.size());

		for (Resume model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResumeSoap[soapModels.size()]);
	}

	public ResumeSoap() {
	}

	public long getPrimaryKey() {
		return _resumeId;
	}

	public void setPrimaryKey(long pk) {
		setResumeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getResumeId() {
		return _resumeId;
	}

	public void setResumeId(long resumeId) {
		_resumeId = resumeId;
	}

	public Date getResumeDate() {
		return _resumeDate;
	}

	public void setResumeDate(Date resumeDate) {
		_resumeDate = resumeDate;
	}

	public String getResumeText() {
		return _resumeText;
	}

	public void setResumeText(String resumeText) {
		_resumeText = resumeText;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private String _uuid;
	private long _resumeId;
	private Date _resumeDate;
	private String _resumeText;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private long _companyId;
	private long _groupId;
	private long _userId;
}