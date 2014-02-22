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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.resume.model.Resume;
import com.resume.service.base.ResumeLocalServiceBaseImpl;

/**
 * The implementation of the resume local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.resume.service.ResumeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Artyom
 * @see com.resume.service.base.ResumeLocalServiceBaseImpl
 * @see com.resume.service.ResumeLocalServiceUtil
 */
public class ResumeLocalServiceImpl extends ResumeLocalServiceBaseImpl {

	public Resume addResume(Resume newResume, long userId, ServiceContext serviceContext)
			throws SystemException,PortalException{
				Resume resume = resumePersistence.create(0);
				resume.setCompanyId(newResume.getCompanyId());
				resume.setGroupId(newResume.getGroupId());
				resume.setUserId(serviceContext.getUserId());
				resume.setResumeDate(newResume.getResumeDate());
				resume.setResumeText(newResume.getResumeText());
				resume.setStatus(WorkflowConstants.STATUS_DRAFT);
				resumePersistence.update(resume, false);
				
				assetEntryLocalService.updateEntry(userId, resume.getGroupId(), 
						Resume.class.getName(), resume.getResumeId(), 
						serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames());
				
				WorkflowHandlerRegistryUtil.startWorkflowInstance(
					resume.getCompanyId(), resume.getGroupId(), userId,
					Resume.class.getName(), resume.getPrimaryKey(), resume,
					serviceContext);
				
				return resume;
		}
		
		public Resume updateStatus(long userId, long resourcePrimKey, int status,
				ServiceContext serviceContext) throws PortalException, SystemException {
			User user = userLocalService.getUser(userId);
			Resume resume = getResume(resourcePrimKey);
			resume.setStatus(status);
			resume.setStatusByUserId(userId);
			resume.setStatusByUserName(user.getFullName());
			resume.setStatusDate(serviceContext.getModifiedDate());
			resumePersistence.update(resume, false);
			if (status == WorkflowConstants.STATUS_APPROVED){
				assetEntryLocalService.updateVisible(Resume.class.getName(), resourcePrimKey, true);
			} else {
				assetEntryLocalService.updateVisible(Resume.class.getName(), resourcePrimKey, false);
			}
			return resume;
		}
		
		public List<Resume> getAllResumes() throws SystemException {
			List<Resume> resumes = resumePersistence.findAll();
			return resumes;
		}
		
		public List<Resume> getAllResumesWithApprovedStatus() throws SystemException{
			List<Resume> resumes = getAllResumes();
			List<Resume> resultList = new ArrayList<Resume>();
			for (Resume resume : resumes){
				if (resume.getStatus() == WorkflowConstants.STATUS_APPROVED)
					resultList.add(resume);
			}
			return resultList;
		}
}