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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DetailsLocalService}.
 *
 * @author Artyom
 * @see DetailsLocalService
 * @generated
 */
public class DetailsLocalServiceWrapper implements DetailsLocalService,
	ServiceWrapper<DetailsLocalService> {
	public DetailsLocalServiceWrapper(DetailsLocalService detailsLocalService) {
		_detailsLocalService = detailsLocalService;
	}

	/**
	* Adds the details to the database. Also notifies the appropriate model listeners.
	*
	* @param details the details
	* @return the details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.resume.model.Details addDetails(com.resume.model.Details details)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.addDetails(details);
	}

	/**
	* Creates a new details with the primary key. Does not add the details to the database.
	*
	* @param detailsId the primary key for the new details
	* @return the new details
	*/
	@Override
	public com.resume.model.Details createDetails(long detailsId) {
		return _detailsLocalService.createDetails(detailsId);
	}

	/**
	* Deletes the details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param detailsId the primary key of the details
	* @return the details that was removed
	* @throws PortalException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.resume.model.Details deleteDetails(long detailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.deleteDetails(detailsId);
	}

	/**
	* Deletes the details from the database. Also notifies the appropriate model listeners.
	*
	* @param details the details
	* @return the details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.resume.model.Details deleteDetails(
		com.resume.model.Details details)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.deleteDetails(details);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detailsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.resume.model.impl.DetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.resume.model.Details fetchDetails(long detailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.fetchDetails(detailsId);
	}

	/**
	* Returns the details with the primary key.
	*
	* @param detailsId the primary key of the details
	* @return the details
	* @throws PortalException if a details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.resume.model.Details getDetails(long detailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.getDetails(detailsId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.resume.model.Details> getDetailses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.getDetailses(start, end);
	}

	/**
	* Returns the number of detailses.
	*
	* @return the number of detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.getDetailsesCount();
	}

	/**
	* Updates the details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param details the details
	* @return the details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.resume.model.Details updateDetails(
		com.resume.model.Details details)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.updateDetails(details);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _detailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_detailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _detailsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.resume.model.Details addDetails(
		com.resume.model.Details newDetail, long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.addDetails(newDetail, resumeId);
	}

	@Override
	public java.util.List<com.resume.model.Details> getDetailsOfResume(
		long resumeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _detailsLocalService.getDetailsOfResume(resumeId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DetailsLocalService getWrappedDetailsLocalService() {
		return _detailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDetailsLocalService(
		DetailsLocalService detailsLocalService) {
		_detailsLocalService = detailsLocalService;
	}

	@Override
	public DetailsLocalService getWrappedService() {
		return _detailsLocalService;
	}

	@Override
	public void setWrappedService(DetailsLocalService detailsLocalService) {
		_detailsLocalService = detailsLocalService;
	}

	private DetailsLocalService _detailsLocalService;
}