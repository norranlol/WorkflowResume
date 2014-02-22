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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.resume.NoSuchDetailsException;

import com.resume.model.Details;
import com.resume.model.impl.DetailsImpl;
import com.resume.model.impl.DetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Artyom
 * @see DetailsPersistence
 * @see DetailsUtil
 * @generated
 */
public class DetailsPersistenceImpl extends BasePersistenceImpl<Details>
	implements DetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DetailsUtil} to access the details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, DetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, DetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RESUMEID = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, DetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByResumeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESUMEID =
		new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, DetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByResumeId",
			new String[] { Long.class.getName() },
			DetailsModelImpl.RESUMEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RESUMEID = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByResumeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the detailses where resumeId = &#63;.
	 *
	 * @param resumeId the resume ID
	 * @return the matching detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Details> findByResumeId(long resumeId)
		throws SystemException {
		return findByResumeId(resumeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Details> findByResumeId(long resumeId, int start, int end)
		throws SystemException {
		return findByResumeId(resumeId, start, end, null);
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
	@Override
	public List<Details> findByResumeId(long resumeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESUMEID;
			finderArgs = new Object[] { resumeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RESUMEID;
			finderArgs = new Object[] { resumeId, start, end, orderByComparator };
		}

		List<Details> list = (List<Details>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Details details : list) {
				if ((resumeId != details.getResumeId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DETAILS_WHERE);

			query.append(_FINDER_COLUMN_RESUMEID_RESUMEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resumeId);

				if (!pagination) {
					list = (List<Details>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Details>(list);
				}
				else {
					list = (List<Details>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Details findByResumeId_First(long resumeId,
		OrderByComparator orderByComparator)
		throws NoSuchDetailsException, SystemException {
		Details details = fetchByResumeId_First(resumeId, orderByComparator);

		if (details != null) {
			return details;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resumeId=");
		msg.append(resumeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDetailsException(msg.toString());
	}

	/**
	 * Returns the first details in the ordered set where resumeId = &#63;.
	 *
	 * @param resumeId the resume ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details, or <code>null</code> if a matching details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details fetchByResumeId_First(long resumeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Details> list = findByResumeId(resumeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Details findByResumeId_Last(long resumeId,
		OrderByComparator orderByComparator)
		throws NoSuchDetailsException, SystemException {
		Details details = fetchByResumeId_Last(resumeId, orderByComparator);

		if (details != null) {
			return details;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resumeId=");
		msg.append(resumeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDetailsException(msg.toString());
	}

	/**
	 * Returns the last details in the ordered set where resumeId = &#63;.
	 *
	 * @param resumeId the resume ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details, or <code>null</code> if a matching details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details fetchByResumeId_Last(long resumeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByResumeId(resumeId);

		if (count == 0) {
			return null;
		}

		List<Details> list = findByResumeId(resumeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Details[] findByResumeId_PrevAndNext(long detailsId, long resumeId,
		OrderByComparator orderByComparator)
		throws NoSuchDetailsException, SystemException {
		Details details = findByPrimaryKey(detailsId);

		Session session = null;

		try {
			session = openSession();

			Details[] array = new DetailsImpl[3];

			array[0] = getByResumeId_PrevAndNext(session, details, resumeId,
					orderByComparator, true);

			array[1] = details;

			array[2] = getByResumeId_PrevAndNext(session, details, resumeId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Details getByResumeId_PrevAndNext(Session session,
		Details details, long resumeId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DETAILS_WHERE);

		query.append(_FINDER_COLUMN_RESUMEID_RESUMEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(resumeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(details);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Details> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the detailses where resumeId = &#63; from the database.
	 *
	 * @param resumeId the resume ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByResumeId(long resumeId) throws SystemException {
		for (Details details : findByResumeId(resumeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(details);
		}
	}

	/**
	 * Returns the number of detailses where resumeId = &#63;.
	 *
	 * @param resumeId the resume ID
	 * @return the number of matching detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByResumeId(long resumeId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RESUMEID;

		Object[] finderArgs = new Object[] { resumeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DETAILS_WHERE);

			query.append(_FINDER_COLUMN_RESUMEID_RESUMEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resumeId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_RESUMEID_RESUMEID_2 = "details.resumeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAIL = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, DetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmail",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, DetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmail",
			new String[] { String.class.getName() },
			DetailsModelImpl.EMAIL_COLUMN_BITMASK |
			DetailsModelImpl.RESUMEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMAIL = new FinderPath(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmail",
			new String[] { String.class.getName() });

	/**
	 * Returns all the detailses where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Details> findByEmail(String email) throws SystemException {
		return findByEmail(email, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Details> findByEmail(String email, int start, int end)
		throws SystemException {
		return findByEmail(email, start, end, null);
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
	@Override
	public List<Details> findByEmail(String email, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL;
			finderArgs = new Object[] { email };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAIL;
			finderArgs = new Object[] { email, start, end, orderByComparator };
		}

		List<Details> list = (List<Details>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Details details : list) {
				if (!Validator.equals(email, details.getEmail())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DETAILS_WHERE);

			boolean bindEmail = false;

			if (email == null) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
			}
			else if (email.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
			}
			else {
				bindEmail = true;

				query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmail) {
					qPos.add(email);
				}

				if (!pagination) {
					list = (List<Details>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Details>(list);
				}
				else {
					list = (List<Details>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Details findByEmail_First(String email,
		OrderByComparator orderByComparator)
		throws NoSuchDetailsException, SystemException {
		Details details = fetchByEmail_First(email, orderByComparator);

		if (details != null) {
			return details;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("email=");
		msg.append(email);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDetailsException(msg.toString());
	}

	/**
	 * Returns the first details in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details, or <code>null</code> if a matching details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details fetchByEmail_First(String email,
		OrderByComparator orderByComparator) throws SystemException {
		List<Details> list = findByEmail(email, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Details findByEmail_Last(String email,
		OrderByComparator orderByComparator)
		throws NoSuchDetailsException, SystemException {
		Details details = fetchByEmail_Last(email, orderByComparator);

		if (details != null) {
			return details;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("email=");
		msg.append(email);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDetailsException(msg.toString());
	}

	/**
	 * Returns the last details in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details, or <code>null</code> if a matching details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details fetchByEmail_Last(String email,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEmail(email);

		if (count == 0) {
			return null;
		}

		List<Details> list = findByEmail(email, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Details[] findByEmail_PrevAndNext(long detailsId, String email,
		OrderByComparator orderByComparator)
		throws NoSuchDetailsException, SystemException {
		Details details = findByPrimaryKey(detailsId);

		Session session = null;

		try {
			session = openSession();

			Details[] array = new DetailsImpl[3];

			array[0] = getByEmail_PrevAndNext(session, details, email,
					orderByComparator, true);

			array[1] = details;

			array[2] = getByEmail_PrevAndNext(session, details, email,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Details getByEmail_PrevAndNext(Session session, Details details,
		String email, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DETAILS_WHERE);

		boolean bindEmail = false;

		if (email == null) {
			query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
		}
		else if (email.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
		}
		else {
			bindEmail = true;

			query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmail) {
			qPos.add(email);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(details);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Details> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the detailses where email = &#63; from the database.
	 *
	 * @param email the email
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmail(String email) throws SystemException {
		for (Details details : findByEmail(email, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(details);
		}
	}

	/**
	 * Returns the number of detailses where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmail(String email) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMAIL;

		Object[] finderArgs = new Object[] { email };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DETAILS_WHERE);

			boolean bindEmail = false;

			if (email == null) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_1);
			}
			else if (email.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAIL_EMAIL_3);
			}
			else {
				bindEmail = true;

				query.append(_FINDER_COLUMN_EMAIL_EMAIL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmail) {
					qPos.add(email);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMAIL_EMAIL_1 = "details.email IS NULL";
	private static final String _FINDER_COLUMN_EMAIL_EMAIL_2 = "details.email = ?";
	private static final String _FINDER_COLUMN_EMAIL_EMAIL_3 = "(details.email IS NULL OR details.email = '')";

	public DetailsPersistenceImpl() {
		setModelClass(Details.class);
	}

	/**
	 * Caches the details in the entity cache if it is enabled.
	 *
	 * @param details the details
	 */
	@Override
	public void cacheResult(Details details) {
		EntityCacheUtil.putResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsImpl.class, details.getPrimaryKey(), details);

		details.resetOriginalValues();
	}

	/**
	 * Caches the detailses in the entity cache if it is enabled.
	 *
	 * @param detailses the detailses
	 */
	@Override
	public void cacheResult(List<Details> detailses) {
		for (Details details : detailses) {
			if (EntityCacheUtil.getResult(
						DetailsModelImpl.ENTITY_CACHE_ENABLED,
						DetailsImpl.class, details.getPrimaryKey()) == null) {
				cacheResult(details);
			}
			else {
				details.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Details details) {
		EntityCacheUtil.removeResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsImpl.class, details.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Details> detailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Details details : detailses) {
			EntityCacheUtil.removeResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
				DetailsImpl.class, details.getPrimaryKey());
		}
	}

	/**
	 * Creates a new details with the primary key. Does not add the details to the database.
	 *
	 * @param detailsId the primary key for the new details
	 * @return the new details
	 */
	@Override
	public Details create(long detailsId) {
		Details details = new DetailsImpl();

		details.setNew(true);
		details.setPrimaryKey(detailsId);

		return details;
	}

	/**
	 * Removes the details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailsId the primary key of the details
	 * @return the details that was removed
	 * @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details remove(long detailsId)
		throws NoSuchDetailsException, SystemException {
		return remove((Serializable)detailsId);
	}

	/**
	 * Removes the details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the details
	 * @return the details that was removed
	 * @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details remove(Serializable primaryKey)
		throws NoSuchDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Details details = (Details)session.get(DetailsImpl.class, primaryKey);

			if (details == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(details);
		}
		catch (NoSuchDetailsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Details removeImpl(Details details) throws SystemException {
		details = toUnwrappedModel(details);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(details)) {
				details = (Details)session.get(DetailsImpl.class,
						details.getPrimaryKeyObj());
			}

			if (details != null) {
				session.delete(details);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (details != null) {
			clearCache(details);
		}

		return details;
	}

	@Override
	public Details updateImpl(com.resume.model.Details details)
		throws SystemException {
		details = toUnwrappedModel(details);

		boolean isNew = details.isNew();

		DetailsModelImpl detailsModelImpl = (DetailsModelImpl)details;

		Session session = null;

		try {
			session = openSession();

			if (details.isNew()) {
				session.save(details);

				details.setNew(false);
			}
			else {
				session.merge(details);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((detailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESUMEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						detailsModelImpl.getOriginalResumeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RESUMEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESUMEID,
					args);

				args = new Object[] { detailsModelImpl.getResumeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RESUMEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESUMEID,
					args);
			}

			if ((detailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { detailsModelImpl.getOriginalEmail() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMAIL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL,
					args);

				args = new Object[] { detailsModelImpl.getEmail() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMAIL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAIL,
					args);
			}
		}

		EntityCacheUtil.putResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
			DetailsImpl.class, details.getPrimaryKey(), details);

		return details;
	}

	protected Details toUnwrappedModel(Details details) {
		if (details instanceof DetailsImpl) {
			return details;
		}

		DetailsImpl detailsImpl = new DetailsImpl();

		detailsImpl.setNew(details.isNew());
		detailsImpl.setPrimaryKey(details.getPrimaryKey());

		detailsImpl.setDetailsId(details.getDetailsId());
		detailsImpl.setSurname(details.getSurname());
		detailsImpl.setName(details.getName());
		detailsImpl.setPatronymic(details.getPatronymic());
		detailsImpl.setAddress(details.getAddress());
		detailsImpl.setPhonenumber(details.getPhonenumber());
		detailsImpl.setEmail(details.getEmail());
		detailsImpl.setPosition(details.getPosition());
		detailsImpl.setEducation(details.getEducation());
		detailsImpl.setKnowledge(details.getKnowledge());
		detailsImpl.setExperience(details.getExperience());
		detailsImpl.setQuailities(details.getQuailities());
		detailsImpl.setAdditionally(details.getAdditionally());
		detailsImpl.setResumeId(details.getResumeId());

		return detailsImpl;
	}

	/**
	 * Returns the details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the details
	 * @return the details
	 * @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDetailsException, SystemException {
		Details details = fetchByPrimaryKey(primaryKey);

		if (details == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return details;
	}

	/**
	 * Returns the details with the primary key or throws a {@link com.resume.NoSuchDetailsException} if it could not be found.
	 *
	 * @param detailsId the primary key of the details
	 * @return the details
	 * @throws com.resume.NoSuchDetailsException if a details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details findByPrimaryKey(long detailsId)
		throws NoSuchDetailsException, SystemException {
		return findByPrimaryKey((Serializable)detailsId);
	}

	/**
	 * Returns the details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the details
	 * @return the details, or <code>null</code> if a details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Details details = (Details)EntityCacheUtil.getResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
				DetailsImpl.class, primaryKey);

		if (details == _nullDetails) {
			return null;
		}

		if (details == null) {
			Session session = null;

			try {
				session = openSession();

				details = (Details)session.get(DetailsImpl.class, primaryKey);

				if (details != null) {
					cacheResult(details);
				}
				else {
					EntityCacheUtil.putResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
						DetailsImpl.class, primaryKey, _nullDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DetailsModelImpl.ENTITY_CACHE_ENABLED,
					DetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return details;
	}

	/**
	 * Returns the details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailsId the primary key of the details
	 * @return the details, or <code>null</code> if a details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Details fetchByPrimaryKey(long detailsId) throws SystemException {
		return fetchByPrimaryKey((Serializable)detailsId);
	}

	/**
	 * Returns all the detailses.
	 *
	 * @return the detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Details> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Details> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Details> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Details> list = (List<Details>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DETAILS;

				if (pagination) {
					sql = sql.concat(DetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Details>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Details>(list);
				}
				else {
					list = (List<Details>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Details details : findAll()) {
			remove(details);
		}
	}

	/**
	 * Returns the number of detailses.
	 *
	 * @return the number of detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DETAILS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.resume.model.Details")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Details>> listenersList = new ArrayList<ModelListener<Details>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Details>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DETAILS = "SELECT details FROM Details details";
	private static final String _SQL_SELECT_DETAILS_WHERE = "SELECT details FROM Details details WHERE ";
	private static final String _SQL_COUNT_DETAILS = "SELECT COUNT(details) FROM Details details";
	private static final String _SQL_COUNT_DETAILS_WHERE = "SELECT COUNT(details) FROM Details details WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "details.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Details exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Details exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DetailsPersistenceImpl.class);
	private static Details _nullDetails = new DetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Details> toCacheModel() {
				return _nullDetailsCacheModel;
			}
		};

	private static CacheModel<Details> _nullDetailsCacheModel = new CacheModel<Details>() {
			@Override
			public Details toEntityModel() {
				return _nullDetails;
			}
		};
}