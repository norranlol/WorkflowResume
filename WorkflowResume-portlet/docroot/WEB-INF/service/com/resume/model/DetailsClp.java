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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.resume.service.ClpSerializer;
import com.resume.service.DetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artyom
 */
public class DetailsClp extends BaseModelImpl<Details> implements Details {
	public DetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Details.class;
	}

	@Override
	public String getModelClassName() {
		return Details.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _detailsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _detailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("detailsId", getDetailsId());
		attributes.put("surname", getSurname());
		attributes.put("name", getName());
		attributes.put("patronymic", getPatronymic());
		attributes.put("address", getAddress());
		attributes.put("phonenumber", getPhonenumber());
		attributes.put("email", getEmail());
		attributes.put("position", getPosition());
		attributes.put("education", getEducation());
		attributes.put("knowledge", getKnowledge());
		attributes.put("experience", getExperience());
		attributes.put("quailities", getQuailities());
		attributes.put("additionally", getAdditionally());
		attributes.put("resumeId", getResumeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long detailsId = (Long)attributes.get("detailsId");

		if (detailsId != null) {
			setDetailsId(detailsId);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String patronymic = (String)attributes.get("patronymic");

		if (patronymic != null) {
			setPatronymic(patronymic);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phonenumber = (String)attributes.get("phonenumber");

		if (phonenumber != null) {
			setPhonenumber(phonenumber);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String education = (String)attributes.get("education");

		if (education != null) {
			setEducation(education);
		}

		String knowledge = (String)attributes.get("knowledge");

		if (knowledge != null) {
			setKnowledge(knowledge);
		}

		String experience = (String)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}

		String quailities = (String)attributes.get("quailities");

		if (quailities != null) {
			setQuailities(quailities);
		}

		String additionally = (String)attributes.get("additionally");

		if (additionally != null) {
			setAdditionally(additionally);
		}

		Long resumeId = (Long)attributes.get("resumeId");

		if (resumeId != null) {
			setResumeId(resumeId);
		}
	}

	@Override
	public long getDetailsId() {
		return _detailsId;
	}

	@Override
	public void setDetailsId(long detailsId) {
		_detailsId = detailsId;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDetailsId", long.class);

				method.invoke(_detailsRemoteModel, detailsId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSurname() {
		return _surname;
	}

	@Override
	public void setSurname(String surname) {
		_surname = surname;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSurname", String.class);

				method.invoke(_detailsRemoteModel, surname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_detailsRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPatronymic() {
		return _patronymic;
	}

	@Override
	public void setPatronymic(String patronymic) {
		_patronymic = patronymic;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPatronymic", String.class);

				method.invoke(_detailsRemoteModel, patronymic);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_detailsRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhonenumber() {
		return _phonenumber;
	}

	@Override
	public void setPhonenumber(String phonenumber) {
		_phonenumber = phonenumber;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPhonenumber", String.class);

				method.invoke(_detailsRemoteModel, phonenumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_detailsRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPosition() {
		return _position;
	}

	@Override
	public void setPosition(String position) {
		_position = position;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPosition", String.class);

				method.invoke(_detailsRemoteModel, position);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEducation() {
		return _education;
	}

	@Override
	public void setEducation(String education) {
		_education = education;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEducation", String.class);

				method.invoke(_detailsRemoteModel, education);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKnowledge() {
		return _knowledge;
	}

	@Override
	public void setKnowledge(String knowledge) {
		_knowledge = knowledge;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setKnowledge", String.class);

				method.invoke(_detailsRemoteModel, knowledge);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExperience() {
		return _experience;
	}

	@Override
	public void setExperience(String experience) {
		_experience = experience;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setExperience", String.class);

				method.invoke(_detailsRemoteModel, experience);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuailities() {
		return _quailities;
	}

	@Override
	public void setQuailities(String quailities) {
		_quailities = quailities;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setQuailities", String.class);

				method.invoke(_detailsRemoteModel, quailities);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdditionally() {
		return _additionally;
	}

	@Override
	public void setAdditionally(String additionally) {
		_additionally = additionally;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setAdditionally", String.class);

				method.invoke(_detailsRemoteModel, additionally);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResumeId() {
		return _resumeId;
	}

	@Override
	public void setResumeId(long resumeId) {
		_resumeId = resumeId;

		if (_detailsRemoteModel != null) {
			try {
				Class<?> clazz = _detailsRemoteModel.getClass();

				Method method = clazz.getMethod("setResumeId", long.class);

				method.invoke(_detailsRemoteModel, resumeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDetailsRemoteModel() {
		return _detailsRemoteModel;
	}

	public void setDetailsRemoteModel(BaseModel<?> detailsRemoteModel) {
		_detailsRemoteModel = detailsRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _detailsRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_detailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DetailsLocalServiceUtil.addDetails(this);
		}
		else {
			DetailsLocalServiceUtil.updateDetails(this);
		}
	}

	@Override
	public Details toEscapedModel() {
		return (Details)ProxyUtil.newProxyInstance(Details.class.getClassLoader(),
			new Class[] { Details.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DetailsClp clone = new DetailsClp();

		clone.setDetailsId(getDetailsId());
		clone.setSurname(getSurname());
		clone.setName(getName());
		clone.setPatronymic(getPatronymic());
		clone.setAddress(getAddress());
		clone.setPhonenumber(getPhonenumber());
		clone.setEmail(getEmail());
		clone.setPosition(getPosition());
		clone.setEducation(getEducation());
		clone.setKnowledge(getKnowledge());
		clone.setExperience(getExperience());
		clone.setQuailities(getQuailities());
		clone.setAdditionally(getAdditionally());
		clone.setResumeId(getResumeId());

		return clone;
	}

	@Override
	public int compareTo(Details details) {
		int value = 0;

		if (getResumeId() < details.getResumeId()) {
			value = -1;
		}
		else if (getResumeId() > details.getResumeId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetailsClp)) {
			return false;
		}

		DetailsClp details = (DetailsClp)obj;

		long primaryKey = details.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{detailsId=");
		sb.append(getDetailsId());
		sb.append(", surname=");
		sb.append(getSurname());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", patronymic=");
		sb.append(getPatronymic());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", phonenumber=");
		sb.append(getPhonenumber());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", education=");
		sb.append(getEducation());
		sb.append(", knowledge=");
		sb.append(getKnowledge());
		sb.append(", experience=");
		sb.append(getExperience());
		sb.append(", quailities=");
		sb.append(getQuailities());
		sb.append(", additionally=");
		sb.append(getAdditionally());
		sb.append(", resumeId=");
		sb.append(getResumeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.resume.model.Details");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>detailsId</column-name><column-value><![CDATA[");
		sb.append(getDetailsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surname</column-name><column-value><![CDATA[");
		sb.append(getSurname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patronymic</column-name><column-value><![CDATA[");
		sb.append(getPatronymic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phonenumber</column-name><column-value><![CDATA[");
		sb.append(getPhonenumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>education</column-name><column-value><![CDATA[");
		sb.append(getEducation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>knowledge</column-name><column-value><![CDATA[");
		sb.append(getKnowledge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>experience</column-name><column-value><![CDATA[");
		sb.append(getExperience());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quailities</column-name><column-value><![CDATA[");
		sb.append(getQuailities());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionally</column-name><column-value><![CDATA[");
		sb.append(getAdditionally());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resumeId</column-name><column-value><![CDATA[");
		sb.append(getResumeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _detailsId;
	private String _surname;
	private String _name;
	private String _patronymic;
	private String _address;
	private String _phonenumber;
	private String _email;
	private String _position;
	private String _education;
	private String _knowledge;
	private String _experience;
	private String _quailities;
	private String _additionally;
	private long _resumeId;
	private BaseModel<?> _detailsRemoteModel;
}