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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Artyom
 * @generated
 */
public class DetailsSoap implements Serializable {
	public static DetailsSoap toSoapModel(Details model) {
		DetailsSoap soapModel = new DetailsSoap();

		soapModel.setDetailsId(model.getDetailsId());
		soapModel.setSurname(model.getSurname());
		soapModel.setName(model.getName());
		soapModel.setPatronymic(model.getPatronymic());
		soapModel.setAddress(model.getAddress());
		soapModel.setPhonenumber(model.getPhonenumber());
		soapModel.setEmail(model.getEmail());
		soapModel.setPosition(model.getPosition());
		soapModel.setEducation(model.getEducation());
		soapModel.setKnowledge(model.getKnowledge());
		soapModel.setExperience(model.getExperience());
		soapModel.setQuailities(model.getQuailities());
		soapModel.setAdditionally(model.getAdditionally());
		soapModel.setResumeId(model.getResumeId());

		return soapModel;
	}

	public static DetailsSoap[] toSoapModels(Details[] models) {
		DetailsSoap[] soapModels = new DetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DetailsSoap[][] toSoapModels(Details[][] models) {
		DetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DetailsSoap[] toSoapModels(List<Details> models) {
		List<DetailsSoap> soapModels = new ArrayList<DetailsSoap>(models.size());

		for (Details model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DetailsSoap[soapModels.size()]);
	}

	public DetailsSoap() {
	}

	public long getPrimaryKey() {
		return _detailsId;
	}

	public void setPrimaryKey(long pk) {
		setDetailsId(pk);
	}

	public long getDetailsId() {
		return _detailsId;
	}

	public void setDetailsId(long detailsId) {
		_detailsId = detailsId;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getPatronymic() {
		return _patronymic;
	}

	public void setPatronymic(String patronymic) {
		_patronymic = patronymic;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getPhonenumber() {
		return _phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		_phonenumber = phonenumber;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getEducation() {
		return _education;
	}

	public void setEducation(String education) {
		_education = education;
	}

	public String getKnowledge() {
		return _knowledge;
	}

	public void setKnowledge(String knowledge) {
		_knowledge = knowledge;
	}

	public String getExperience() {
		return _experience;
	}

	public void setExperience(String experience) {
		_experience = experience;
	}

	public String getQuailities() {
		return _quailities;
	}

	public void setQuailities(String quailities) {
		_quailities = quailities;
	}

	public String getAdditionally() {
		return _additionally;
	}

	public void setAdditionally(String additionally) {
		_additionally = additionally;
	}

	public long getResumeId() {
		return _resumeId;
	}

	public void setResumeId(long resumeId) {
		_resumeId = resumeId;
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
}