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

import com.resume.model.Details;

import java.util.List;

/**
 * The persistence utility for the details service. This utility wraps {@link DetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Artyom
 * @see DetailsPersistence
 * @see DetailsPersistenceImpl
 * @generated
 */
public class DetailsUtil {
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
	public static void clearCache(Details details) {
		getPersistence().clearCache(details);
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
	public static List<Details> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Details> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Details> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Details update(Details details) throws SystemException {
		return getPersistence().update(details);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Details update(Details details, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(details, serviceContext);
	}

	/**
	* Returns all the detailses where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @return the matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Details> findByResumeId(
		long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByResumeId(resumeId);
	}

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
	public static java.util.List<com.resume.model.Details> findByResumeId(
		long resumeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByResumeId(resumeId, start, end);
	}

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
	public static java.util.List<com.resume.model.Details> findByResumeId(
		long resumeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByResumeId(resumeId, start, end, orderByComparator);
	}

	/**
	* Returns the first details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details findByResumeId_First(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence().findByResumeId_First(resumeId, orderByComparator);
	}

	/**
	* Returns the first details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details fetchByResumeId_First(
		long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByResumeId_First(resumeId, orderByComparator);
	}

	/**
	* Returns the last details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details findByResumeId_Last(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence().findByResumeId_Last(resumeId, orderByComparator);
	}

	/**
	* Returns the last details in the ordered set where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details fetchByResumeId_Last(long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByResumeId_Last(resumeId, orderByComparator);
	}

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
	public static com.resume.model.Details[] findByResumeId_PrevAndNext(
		long detailsId, long resumeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence()
				   .findByResumeId_PrevAndNext(detailsId, resumeId,
			orderByComparator);
	}

	/**
	* Removes all the detailses where resumeId = &#63; from the database.
	*
	* @param resumeId the resume ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByResumeId(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByResumeId(resumeId);
	}

	/**
	* Returns the number of detailses where resumeId = &#63;.
	*
	* @param resumeId the resume ID
	* @return the number of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByResumeId(long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByResumeId(resumeId);
	}

	/**
	* Returns all the detailses where email = &#63;.
	*
	* @param email the email
	* @return the matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Details> findByEmail(
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmail(email);
	}

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
	public static java.util.List<com.resume.model.Details> findByEmail(
		java.lang.String email, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmail(email, start, end);
	}

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
	public static java.util.List<com.resume.model.Details> findByEmail(
		java.lang.String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmail(email, start, end, orderByComparator);
	}

	/**
	* Returns the first details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details findByEmail_First(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence().findByEmail_First(email, orderByComparator);
	}

	/**
	* Returns the first details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details fetchByEmail_First(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmail_First(email, orderByComparator);
	}

	/**
	* Returns the last details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details
	* @throws com.resume.NoSuchDetailsException if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details findByEmail_Last(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence().findByEmail_Last(email, orderByComparator);
	}

	/**
	* Returns the last details in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching details, or <code>null</code> if a matching details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details fetchByEmail_Last(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmail_Last(email, orderByComparator);
	}

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
	public static com.resume.model.Details[] findByEmail_PrevAndNext(
		long detailsId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence()
				   .findByEmail_PrevAndNext(detailsId, email, orderByComparator);
	}

	/**
	* Removes all the detailses where email = &#63; from the database.
	*
	* @param email the email
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmail(email);
	}

	/**
	* Returns the number of detailses where email = &#63;.
	*
	* @param email the email
	* @return the number of matching detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmail(email);
	}

	/**
	* Caches the details in the entity cache if it is enabled.
	*
	* @param details the details
	*/
	public static void cacheResult(com.resume.model.Details details) {
		getPersistence().cacheResult(details);
	}

	/**
	* Caches the detailses in the entity cache if it is enabled.
	*
	* @param detailses the detailses
	*/
	public static void cacheResult(
		java.util.List<com.resume.model.Details> detailses) {
		getPersistence().cacheResult(detailses);
	}

	/**
	* Creates a new details with the primary key. Does not add the details to the database.
	*
	* @param detailsId the primary key for the new details
	* @return the new details
	*/
	public static com.resume.model.Details create(long detailsId) {
		return getPersistence().create(detailsId);
	}

	/**
	* Removes the details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detailsId the primary key of the details
	* @return the details that was removed
	* @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details remove(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence().remove(detailsId);
	}

	public static com.resume.model.Details updateImpl(
		com.resume.model.Details details)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(details);
	}

	/**
	* Returns the details with the primary key or throws a {@link com.resume.NoSuchDetailsException} if it could not be found.
	*
	* @param detailsId the primary key of the details
	* @return the details
	* @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details findByPrimaryKey(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.resume.NoSuchDetailsException {
		return getPersistence().findByPrimaryKey(detailsId);
	}

	/**
	* Returns the details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param detailsId the primary key of the details
	* @return the details, or <code>null</code> if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.resume.model.Details fetchByPrimaryKey(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(detailsId);
	}

	/**
	* Returns all the detailses.
	*
	* @return the detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.resume.model.Details> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.resume.model.Details> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.resume.model.Details> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of detailses.
	*
	* @return the number of detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DetailsPersistence)PortletBeanLocatorUtil.locate(com.resume.service.ClpSerializer.getServletContextName(),
					DetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(DetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DetailsPersistence persistence) {
	}

	private static DetailsPersistence _persistence;
}