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

import com.resume.model.Details;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Details in entity cache.
 *
 * @author Artyom
 * @see Details
 * @generated
 */
public class DetailsCacheModel implements CacheModel<Details>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{detailsId=");
		sb.append(detailsId);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", name=");
		sb.append(name);
		sb.append(", patronymic=");
		sb.append(patronymic);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phonenumber=");
		sb.append(phonenumber);
		sb.append(", email=");
		sb.append(email);
		sb.append(", position=");
		sb.append(position);
		sb.append(", education=");
		sb.append(education);
		sb.append(", knowledge=");
		sb.append(knowledge);
		sb.append(", experience=");
		sb.append(experience);
		sb.append(", quailities=");
		sb.append(quailities);
		sb.append(", additionally=");
		sb.append(additionally);
		sb.append(", resumeId=");
		sb.append(resumeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Details toEntityModel() {
		DetailsImpl detailsImpl = new DetailsImpl();

		detailsImpl.setDetailsId(detailsId);

		if (surname == null) {
			detailsImpl.setSurname(StringPool.BLANK);
		}
		else {
			detailsImpl.setSurname(surname);
		}

		if (name == null) {
			detailsImpl.setName(StringPool.BLANK);
		}
		else {
			detailsImpl.setName(name);
		}

		if (patronymic == null) {
			detailsImpl.setPatronymic(StringPool.BLANK);
		}
		else {
			detailsImpl.setPatronymic(patronymic);
		}

		if (address == null) {
			detailsImpl.setAddress(StringPool.BLANK);
		}
		else {
			detailsImpl.setAddress(address);
		}

		if (phonenumber == null) {
			detailsImpl.setPhonenumber(StringPool.BLANK);
		}
		else {
			detailsImpl.setPhonenumber(phonenumber);
		}

		if (email == null) {
			detailsImpl.setEmail(StringPool.BLANK);
		}
		else {
			detailsImpl.setEmail(email);
		}

		if (position == null) {
			detailsImpl.setPosition(StringPool.BLANK);
		}
		else {
			detailsImpl.setPosition(position);
		}

		if (education == null) {
			detailsImpl.setEducation(StringPool.BLANK);
		}
		else {
			detailsImpl.setEducation(education);
		}

		if (knowledge == null) {
			detailsImpl.setKnowledge(StringPool.BLANK);
		}
		else {
			detailsImpl.setKnowledge(knowledge);
		}

		if (experience == null) {
			detailsImpl.setExperience(StringPool.BLANK);
		}
		else {
			detailsImpl.setExperience(experience);
		}

		if (quailities == null) {
			detailsImpl.setQuailities(StringPool.BLANK);
		}
		else {
			detailsImpl.setQuailities(quailities);
		}

		if (additionally == null) {
			detailsImpl.setAdditionally(StringPool.BLANK);
		}
		else {
			detailsImpl.setAdditionally(additionally);
		}

		detailsImpl.setResumeId(resumeId);

		detailsImpl.resetOriginalValues();

		return detailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		detailsId = objectInput.readLong();
		surname = objectInput.readUTF();
		name = objectInput.readUTF();
		patronymic = objectInput.readUTF();
		address = objectInput.readUTF();
		phonenumber = objectInput.readUTF();
		email = objectInput.readUTF();
		position = objectInput.readUTF();
		education = objectInput.readUTF();
		knowledge = objectInput.readUTF();
		experience = objectInput.readUTF();
		quailities = objectInput.readUTF();
		additionally = objectInput.readUTF();
		resumeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(detailsId);

		if (surname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (patronymic == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(patronymic);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (phonenumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phonenumber);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (position == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (education == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(education);
		}

		if (knowledge == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(knowledge);
		}

		if (experience == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(experience);
		}

		if (quailities == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quailities);
		}

		if (additionally == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(additionally);
		}

		objectOutput.writeLong(resumeId);
	}

	public long detailsId;
	public String surname;
	public String name;
	public String patronymic;
	public String address;
	public String phonenumber;
	public String email;
	public String position;
	public String education;
	public String knowledge;
	public String experience;
	public String quailities;
	public String additionally;
	public long resumeId;
}