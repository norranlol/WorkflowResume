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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.resume.model.Resume;

import java.util.List;

/**
 * The persistence utility for the resume service. This utility wraps {@link ResumePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Artyom
 * @see ResumePersistence
 * @see ResumePersistenceImpl
 * @generated
 */
public class ResumeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Resume resume) {
		getPersistence().clearCache(resume);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Resume> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Resume> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Resume> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Resume update(Resume resume) throws SystemException {
		return getPersistence().update(resume);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Resume update(Resume resume, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(resume, serviceContext);
	}

	/**
	* Returns all the resumes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the resumes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the resumes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the resumes before and after the current resume in the ordered set where uuid = &#63;.
	*
	* @param resumeId the primary key of the current resume
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume[] findByUuid_PrevAndNext(
		long resumeId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByUuid_PrevAndNext(resumeId, uuid, orderByComparator);
	}

	/**
	* Removes all the resumes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of resumes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the resume where uuid = &#63; and groupId = &#63; or throws a {@link com.resume.NoSuchResumeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the resume where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the resume where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the resume where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the resume that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of resumes where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the resumes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the resumes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the resumes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the resumes before and after the current resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param resumeId the primary key of the current resume
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume[] findByUuid_C_PrevAndNext(
		long resumeId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(resumeId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the resumes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of resumes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the resumes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the resumes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the resumes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the resumes before and after the current resume in the ordered set where groupId = &#63;.
	*
	* @param resumeId the primary key of the current resume
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume[] findByGroupId_PrevAndNext(
		long resumeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(resumeId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the resumes where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of resumes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the resumes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the resumes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the resumes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the resumes before and after the current resume in the ordered set where companyId = &#63;.
	*
	* @param resumeId the primary key of the current resume
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume[] findByCompanyId_PrevAndNext(
		long resumeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(resumeId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the resumes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of resumes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the resumes where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByResumeText(
		java.lang.String resumeText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByResumeText(resumeText);
	}

	/**
	* Returns a range of all the resumes where resumeText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resumeText the resume text
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByResumeText(
		java.lang.String resumeText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByResumeText(resumeText, start, end);
	}

	/**
	* Returns an ordered range of all the resumes where resumeText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resumeText the resume text
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByResumeText(
		java.lang.String resumeText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResumeText(resumeText, start, end, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByResumeText_First(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByResumeText_First(resumeText, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByResumeText_First(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByResumeText_First(resumeText, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByResumeText_Last(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByResumeText_Last(resumeText, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByResumeText_Last(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByResumeText_Last(resumeText, orderByComparator);
	}

	/**
	* Returns the resumes before and after the current resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeId the primary key of the current resume
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume[] findByResumeText_PrevAndNext(
		long resumeId, java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByResumeText_PrevAndNext(resumeId, resumeText,
			orderByComparator);
	}

	/**
	* Removes all the resumes where resumeText = &#63; from the database.
	*
	* @param resumeText the resume text
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByResumeText(java.lang.String resumeText)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByResumeText(resumeText);
	}

	/**
	* Returns the number of resumes where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByResumeText(java.lang.String resumeText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByResumeText(resumeText);
	}

	/**
	* Returns all the resumes where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByG_S(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Returns a range of all the resumes where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @return the range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByG_S(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the resumes where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByG_S_First(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByG_S_First(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByG_S_Last(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByG_S_Last(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the resumes before and after the current resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param resumeId the primary key of the current resume
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume[] findByG_S_PrevAndNext(
		long resumeId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence()
				   .findByG_S_PrevAndNext(resumeId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the resumes where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of resumes where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Caches the resume in the entity cache if it is enabled.
	*
	* @param resume the resume
	*/
	public static void cacheResult(com.resume.model.Resume resume) {
		getPersistence().cacheResult(resume);
	}

	/**
	* Caches the resumes in the entity cache if it is enabled.
	*
	* @param resumes the resumes
	*/
	public static void cacheResult(
		java.util.List<com.resume.model.Resume> resumes) {
		getPersistence().cacheResult(resumes);
	}

	/**
	* Creates a new resume with the primary key. Does not add the resume to the database.
	*
	* @param resumeId the primary key for the new resume
	* @return the new resume
	*/
	public static com.resume.model.Resume create(long resumeId) {
		return getPersistence().create(resumeId);
	}

	/**
	* Removes the resume with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resumeId the primary key of the resume
	* @return the resume that was removed
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume remove(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().remove(resumeId);
	}

	public static com.resume.model.Resume updateImpl(
		com.resume.model.Resume resume)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resume);
	}

	/**
	* Returns the resume with the primary key or throws a {@link com.resume.NoSuchResumeException} if it could not be found.
	*
	* @param resumeId the primary key of the resume
	* @return the resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume findByPrimaryKey(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException {
		return getPersistence().findByPrimaryKey(resumeId);
	}

	/**
	* Returns the resume with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resumeId the primary key of the resume
	* @return the resume, or <code>null</code> if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Resume fetchByPrimaryKey(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(resumeId);
	}

	/**
	* Returns all the resumes.
	*
	* @return the resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.resume.model.Resume> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the resumes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.ResumeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resumes
	* @param end the upper bound of the range of resumes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of resumes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Resume> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the resumes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of resumes.
	*
	* @return the number of resumes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResumePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResumePersistence)PortletBeanLocatorUtil.locate(com.resume.service.ClpSerializer.getServletContextName(),
					ResumePersistence.class.getName());

			ReferenceRegistry.registerReference(ResumeUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ResumePersistence persistence) {
	}

	private static ResumePersistence _persistence;
}