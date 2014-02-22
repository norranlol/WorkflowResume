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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Details}.
 * </p>
 *
 * @author Artyom
 * @see Details
 * @generated
 */
public class DetailsWrapper implements Details, ModelWrapper<Details> {
	public DetailsWrapper(Details details) {
		_details = details;
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

	/**
	* Returns the primary key of this details.
	*
	* @return the primary key of this details
	*/
	@Override
	public long getPrimaryKey() {
		return _details.getPrimaryKey();
	}

	/**
	* Sets the primary key of this details.
	*
	* @param primaryKey the primary key of this details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_details.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the details ID of this details.
	*
	* @return the details ID of this details
	*/
	@Override
	public long getDetailsId() {
		return _details.getDetailsId();
	}

	/**
	* Sets the details ID of this details.
	*
	* @param detailsId the details ID of this details
	*/
	@Override
	public void setDetailsId(long detailsId) {
		_details.setDetailsId(detailsId);
	}

	/**
	* Returns the surname of this details.
	*
	* @return the surname of this details
	*/
	@Override
	public java.lang.String getSurname() {
		return _details.getSurname();
	}

	/**
	* Sets the surname of this details.
	*
	* @param surname the surname of this details
	*/
	@Override
	public void setSurname(java.lang.String surname) {
		_details.setSurname(surname);
	}

	/**
	* Returns the name of this details.
	*
	* @return the name of this details
	*/
	@Override
	public java.lang.String getName() {
		return _details.getName();
	}

	/**
	* Sets the name of this details.
	*
	* @param name the name of this details
	*/
	@Override
	public void setName(java.lang.String name) {
		_details.setName(name);
	}

	/**
	* Returns the patronymic of this details.
	*
	* @return the patronymic of this details
	*/
	@Override
	public java.lang.String getPatronymic() {
		return _details.getPatronymic();
	}

	/**
	* Sets the patronymic of this details.
	*
	* @param patronymic the patronymic of this details
	*/
	@Override
	public void setPatronymic(java.lang.String patronymic) {
		_details.setPatronymic(patronymic);
	}

	/**
	* Returns the address of this details.
	*
	* @return the address of this details
	*/
	@Override
	public java.lang.String getAddress() {
		return _details.getAddress();
	}

	/**
	* Sets the address of this details.
	*
	* @param address the address of this details
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_details.setAddress(address);
	}

	/**
	* Returns the phonenumber of this details.
	*
	* @return the phonenumber of this details
	*/
	@Override
	public java.lang.String getPhonenumber() {
		return _details.getPhonenumber();
	}

	/**
	* Sets the phonenumber of this details.
	*
	* @param phonenumber the phonenumber of this details
	*/
	@Override
	public void setPhonenumber(java.lang.String phonenumber) {
		_details.setPhonenumber(phonenumber);
	}

	/**
	* Returns the email of this details.
	*
	* @return the email of this details
	*/
	@Override
	public java.lang.String getEmail() {
		return _details.getEmail();
	}

	/**
	* Sets the email of this details.
	*
	* @param email the email of this details
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_details.setEmail(email);
	}

	/**
	* Returns the position of this details.
	*
	* @return the position of this details
	*/
	@Override
	public java.lang.String getPosition() {
		return _details.getPosition();
	}

	/**
	* Sets the position of this details.
	*
	* @param position the position of this details
	*/
	@Override
	public void setPosition(java.lang.String position) {
		_details.setPosition(position);
	}

	/**
	* Returns the education of this details.
	*
	* @return the education of this details
	*/
	@Override
	public java.lang.String getEducation() {
		return _details.getEducation();
	}

	/**
	* Sets the education of this details.
	*
	* @param education the education of this details
	*/
	@Override
	public void setEducation(java.lang.String education) {
		_details.setEducation(education);
	}

	/**
	* Returns the knowledge of this details.
	*
	* @return the knowledge of this details
	*/
	@Override
	public java.lang.String getKnowledge() {
		return _details.getKnowledge();
	}

	/**
	* Sets the knowledge of this details.
	*
	* @param knowledge the knowledge of this details
	*/
	@Override
	public void setKnowledge(java.lang.String knowledge) {
		_details.setKnowledge(knowledge);
	}

	/**
	* Returns the experience of this details.
	*
	* @return the experience of this details
	*/
	@Override
	public java.lang.String getExperience() {
		return _details.getExperience();
	}

	/**
	* Sets the experience of this details.
	*
	* @param experience the experience of this details
	*/
	@Override
	public void setExperience(java.lang.String experience) {
		_details.setExperience(experience);
	}

	/**
	* Returns the quailities of this details.
	*
	* @return the quailities of this details
	*/
	@Override
	public java.lang.String getQuailities() {
		return _details.getQuailities();
	}

	/**
	* Sets the quailities of this details.
	*
	* @param quailities the quailities of this details
	*/
	@Override
	public void setQuailities(java.lang.String quailities) {
		_details.setQuailities(quailities);
	}

	/**
	* Returns the additionally of this details.
	*
	* @return the additionally of this details
	*/
	@Override
	public java.lang.String getAdditionally() {
		return _details.getAdditionally();
	}

	/**
	* Sets the additionally of this details.
	*
	* @param additionally the additionally of this details
	*/
	@Override
	public void setAdditionally(java.lang.String additionally) {
		_details.setAdditionally(additionally);
	}

	/**
	* Returns the resume ID of this details.
	*
	* @return the resume ID of this details
	*/
	@Override
	public long getResumeId() {
		return _details.getResumeId();
	}

	/**
	* Sets the resume ID of this details.
	*
	* @param resumeId the resume ID of this details
	*/
	@Override
	public void setResumeId(long resumeId) {
		_details.setResumeId(resumeId);
	}

	@Override
	public boolean isNew() {
		return _details.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_details.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _details.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_details.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _details.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _details.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_details.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _details.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_details.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_details.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_details.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DetailsWrapper((Details)_details.clone());
	}

	@Override
	public int compareTo(com.resume.model.Details details) {
		return _details.compareTo(details);
	}

	@Override
	public int hashCode() {
		return _details.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.resume.model.Details> toCacheModel() {
		return _details.toCacheModel();
	}

	@Override
	public com.resume.model.Details toEscapedModel() {
		return new DetailsWrapper(_details.toEscapedModel());
	}

	@Override
	public com.resume.model.Details toUnescapedModel() {
		return new DetailsWrapper(_details.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _details.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _details.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_details.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetailsWrapper)) {
			return false;
		}

		DetailsWrapper detailsWrapper = (DetailsWrapper)obj;

		if (Validator.equals(_details, detailsWrapper._details)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Details getWrappedDetails() {
		return _details;
	}

	@Override
	public Details getWrappedModel() {
		return _details;
	}

	@Override
	public void resetOriginalValues() {
		_details.resetOriginalValues();
	}

	private Details _details;
}