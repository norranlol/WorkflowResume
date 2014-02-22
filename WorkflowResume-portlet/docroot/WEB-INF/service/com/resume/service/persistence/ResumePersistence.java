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

import com.liferay.portal.service.persistence.BasePersistence;

import com.resume.model.Resume;

/**
 * The persistence interface for the resume service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Artyom
 * @see ResumePersistenceImpl
 * @see ResumeUtil
 * @generated
 */
public interface ResumePersistence extends BasePersistence<Resume> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResumeUtil} to access the resume persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the resumes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the first resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the last resume in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume[] findByUuid_PrevAndNext(long resumeId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Removes all the resumes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the resume where uuid = &#63; and groupId = &#63; or throws a {@link com.resume.NoSuchResumeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the resume where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the resume where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the resume where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the resume that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the number of resumes where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the resumes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the first resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the last resume in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume[] findByUuid_C_PrevAndNext(long resumeId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Removes all the resumes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the resumes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByGroupId(long groupId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the first resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the last resume in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume[] findByGroupId_PrevAndNext(long resumeId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Removes all the resumes where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the resumes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the first resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the last resume in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume[] findByCompanyId_PrevAndNext(
		long resumeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Removes all the resumes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the resumes where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findByResumeText(
		java.lang.String resumeText)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByResumeText(
		java.lang.String resumeText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByResumeText(
		java.lang.String resumeText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByResumeText_First(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the first resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByResumeText_First(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume
	* @throws com.resume.NoSuchResumeException if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByResumeText_Last(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the last resume in the ordered set where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByResumeText_Last(
		java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume[] findByResumeText_PrevAndNext(
		long resumeId, java.lang.String resumeText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Removes all the resumes where resumeText = &#63; from the database.
	*
	* @param resumeText the resume text
	* @throws SystemException if a system exception occurred
	*/
	public void removeByResumeText(java.lang.String resumeText)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes where resumeText = &#63;.
	*
	* @param resumeText the resume text
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByResumeText(java.lang.String resumeText)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the resumes where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findByG_S(long groupId,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByG_S(long groupId,
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findByG_S(long groupId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the first resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the last resume in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching resume, or <code>null</code> if a matching resume could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.resume.model.Resume[] findByG_S_PrevAndNext(long resumeId,
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Removes all the resumes where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the resume in the entity cache if it is enabled.
	*
	* @param resume the resume
	*/
	public void cacheResult(com.resume.model.Resume resume);

	/**
	* Caches the resumes in the entity cache if it is enabled.
	*
	* @param resumes the resumes
	*/
	public void cacheResult(java.util.List<com.resume.model.Resume> resumes);

	/**
	* Creates a new resume with the primary key. Does not add the resume to the database.
	*
	* @param resumeId the primary key for the new resume
	* @return the new resume
	*/
	public com.resume.model.Resume create(long resumeId);

	/**
	* Removes the resume with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resumeId the primary key of the resume
	* @return the resume that was removed
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume remove(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	public com.resume.model.Resume updateImpl(com.resume.model.Resume resume)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the resume with the primary key or throws a {@link com.resume.NoSuchResumeException} if it could not be found.
	*
	* @param resumeId the primary key of the resume
	* @return the resume
	* @throws com.resume.NoSuchResumeException if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume findByPrimaryKey(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchResumeException;

	/**
	* Returns the resume with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resumeId the primary key of the resume
	* @return the resume, or <code>null</code> if a resume with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Resume fetchByPrimaryKey(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the resumes.
	*
	* @return the resumes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Resume> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.resume.model.Resume> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the resumes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of resumes.
	*
	* @return the number of resumes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}