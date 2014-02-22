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

package com.resume.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.ClassName;
import com.liferay.portal.service.ServiceContext;
import com.resume.model.Details;
import com.resume.model.Resume;
import com.resume.service.DetailsLocalServiceUtil;
import com.resume.service.base.DetailsLocalServiceBaseImpl;

/**
 * The implementation of the details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.resume.service.DetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Artyom
 * @see com.resume.service.base.DetailsLocalServiceBaseImpl
 * @see com.resume.service.DetailsLocalServiceUtil
 */
public class DetailsLocalServiceImpl extends DetailsLocalServiceBaseImpl {		
	
	public Details addDetails(Details newDetail, long resumeId) throws SystemException{
		long primaryKey = CounterLocalServiceUtil.increment(Details.class.getName());
		Details detail = DetailsLocalServiceUtil.createDetails(0);
		detail.setDetailsId(newDetail.getDetailsId());
		detail.setSurname(newDetail.getSurname());
		detail.setName(newDetail.getName());
		detail.setPatronymic(newDetail.getPatronymic());
		detail.setAddress(newDetail.getAddress());
		detail.setPhonenumber(newDetail.getPhonenumber());
		detail.setEmail(newDetail.getEmail());
		detail.setPosition(newDetail.getPosition());
		detail.setEducation(newDetail.getEducation());
		detail.setKnowledge(newDetail.getKnowledge());
		detail.setExperience(newDetail.getExperience());
		detail.setQuailities(newDetail.getQuailities());
		detail.setAdditionally(newDetail.getAdditionally());
		detail.setResumeId(resumeId);
		DetailsLocalServiceUtil.addDetails(detail);
		return detail;
	}
	
	public List<Details> getDetailsOfResume(long resumeId) throws SystemException{
		List<Details> details = detailsPersistence.findByResumeId(resumeId);
		return details;
	}	
}