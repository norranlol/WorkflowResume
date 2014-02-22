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

package com.resume.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Resume. This utility wraps
 * {@link com.resume.service.impl.ResumeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Artyom
 * @see ResumeLocalService
 * @see com.resume.service.base.ResumeLocalServiceBaseImpl
 * @see com.resume.service.impl.ResumeLocalServiceImpl
 * @generated
 */
public class ResumeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.resume.service.impl.ResumeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the resume to the database. Also notifies the appropriate model listeners.
	*
	* @param resume the resume
	* @return the resume that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume addResume(
		com.resume.model.Resume resume)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addResume(resume);
	}

	/**
	* Creates a new resume with the primary key. Does not add the resume to the database.
	*
	* @param resumeId the primary key for the new resume
	* @return the new resume
	*/
	public static com.resume.model.Resume createResume(long resumeId) {
		return getService().createResume(resumeId);
	}

	/**
	* Deletes the resume with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resumeId the primary key of the resume
	* @return the resume that was removed
	* @throws PortalException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume deleteResume(long resumeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteResume(resumeId);
	}

	/**
	* Deletes the resume from the database. Also notifies the appropriate model listeners.
	*
	* @param resume the resume
	* @return the resume that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume deleteResume(
		com.resume.model.Resume resume)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteResume(resume);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.resume.model.Resume fetchResume(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchResume(resumeId);
	}

	/**
	* Returns the resume with the matching UUID and company.
	*
	* @param uuid the resume's UUID
	* @param companyId the primary key of the company
	* @return the matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchResumeByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchResumeByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the resume matching the UUID and group.
	*
	* @param uuid the resume's UUID
	* @param groupId the primary key of the group
	* @return the matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchResumeByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchResumeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the resume with the primary key.
	*
	* @param resumeId the primary key of the resume
	* @return the resume
	* @throws PortalException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume getResume(long resumeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getResume(resumeId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the resume with the matching UUID and company.
	*
	* @param uuid the resume's UUID
	* @param companyId the primary key of the company
	* @return the matching resume
	* @throws PortalException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume getResumeByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getResumeByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the resume matching the UUID and group.
	*
	* @param uuid the resume's UUID
	* @param groupId the primary key of the group
	* @return the matching resume
	* @throws PortalException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume getResumeByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getResumeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the resumes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> getResumes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResumes(start, end);
	}

	/**
	* Returns the number of resumes.
	*
	* @return the number of resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int getResumesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResumesCount();
	}

	/**
	* Updates the resume in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resume the resume
	* @return the resume that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume updateResume(
		com.resume.model.Resume resume)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateResume(resume);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.resume.model.Resume addResume(
		com.resume.model.Resume newResume, long userId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addResume(newResume, userId, serviceContext);
	}

	public static com.resume.model.Resume updateStatus(long userId,
		long resourcePrimKey, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStatus(userId, resourcePrimKey, status, serviceContext);
	}

	public static java.util.List<com.resume.model.Resume> getAllResumes()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllResumes();
	}

	public static java.util.List<com.resume.model.Resume> getAllResumesWithApprovedStatus()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllResumesWithApprovedStatus();
	}

	public static void clearService() {
		_service = null;
	}

	public static ResumeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ResumeLocalService.class.getName());

			if (invokableLocalService instanceof ResumeLocalService) {
				_service = (ResumeLocalService)invokableLocalService;
			}
			else {
				_service = new ResumeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ResumeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ResumeLocalService service) {
	}

	private static ResumeLocalService _service;
}