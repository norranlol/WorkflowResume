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

package com.resume.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.resume.model.Resume;

import com.resume.service.ResumeLocalServiceUtil;

/**
 * @author Artyom
 * @generated
 */
public abstract class ResumeActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ResumeActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ResumeLocalServiceUtil.getService());
		setClass(Resume.class);

		setClassLoader(com.resume.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("resumeId");
	}
}