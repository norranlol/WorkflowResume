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

import com.resume.model.Details;

/**
 * The persistence interface for the details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Artyom
 * @see DetailsPersistenceImpl
 * @see DetailsUtil
 * @generated
 */
public interface DetailsPersistence extends BasePersistence<Details> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetailsUtil} to access the details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the detailses where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @return the matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findByResumeId(
		long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the detailses where resumeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resumeId the resume ID
	* @param start the lower bound of the range of detailses
	* @param end the upper bound of the range of detailses (not inclusive)
	* @return the range of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findByResumeId(
		long resumeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the detailses where resumeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resumeId the resume ID
	* @param start the lower bound of the range of detailses
	* @param end the upper bound of the range of detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findByResumeId(
		long resumeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details findByResumeId_First(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Returns the first details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details fetchByResumeId_First(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details findByResumeId_Last(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Returns the last details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details fetchByResumeId_Last(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the detailses before and after the current details in the ordered set where resumeId = &#63;.
	*
	* @param detailsId the primary key of the current details
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next details
	* @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details[] findByResumeId_PrevAndNext(
		long detailsId, long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Removes all the detailses where resumeId = &#63; from the database.
	*
	* @param resumeId the resume ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByResumeId(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of detailses where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @return the number of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByResumeId(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the detailses where email = &#63;.
	*
	* @param email the email
	* @return the matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findByEmail(
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the detailses where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of detailses
	* @param end the upper bound of the range of detailses (not inclusive)
	* @return the range of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findByEmail(
		java.lang.String email, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the detailses where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of detailses
	* @param end the upper bound of the range of detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findByEmail(
		java.lang.String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details findByEmail_First(java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Returns the first details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details fetchByEmail_First(java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details findByEmail_Last(java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Returns the last details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details fetchByEmail_Last(java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the detailses before and after the current details in the ordered set where email = &#63;.
	*
	* @param detailsId the primary key of the current details
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next details
	* @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details[] findByEmail_PrevAndNext(long detailsId,
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Removes all the detailses where email = &#63; from the database.
	*
	* @param email the email
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of detailses where email = &#63;.
	*
	* @param email the email
	* @return the number of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the details in the entity cache if it is enabled.
	*
	* @param details the details
	*/
	public void cacheResult(com.resume.model.Details details);

	/**
	* Caches the detailses in the entity cache if it is enabled.
	*
	* @param detailses the detailses
	*/
	public void cacheResult(java.util.List<com.resume.model.Details> detailses);

	/**
	* Creates a new details with the primary key. Does not add the details to the database.
	*
	* @param detailsId the primary key for the new details
	* @return the new details
	*/
	public com.resume.model.Details create(long detailsId);

	/**
	* Removes the details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detailsId the primary key of the details
	* @return the details that was removed
	* @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details remove(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	public com.resume.model.Details updateImpl(com.resume.model.Details details)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the details with the primary key or throws a {@link com.resume.NoSuchDetailsException} if it could not be found.
	*
	* @param detailsId the primary key of the details
	* @return the details
	* @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details findByPrimaryKey(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException;

	/**
	* Returns the details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param detailsId the primary key of the details
	* @return the details, or <code>null</code> if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.resume.model.Details fetchByPrimaryKey(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the detailses.
	*
	* @return the detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detailses
	* @param end the upper bound of the range of detailses (not inclusive)
	* @return the range of detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of detailses
	* @param end the upper bound of the range of detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.resume.model.Details> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of detailses.
	*
	* @return the number of detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}