package com.resume.workflow;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;
import com.resume.model.Resume;
import com.resume.service.ResumeLocalServiceUtil;

public class ResumeWorkflowHandler extends BaseWorkflowHandler {

	public static final String CLASS_NAME = Resume.class.getName();
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType(Locale locale) {
		return LanguageUtil.get(locale, "model.resource." + CLASS_NAME);
	}

	@Override
	public Object updateStatus(int status, Map<String, Serializable> workflowContext)
			throws PortalException, SystemException {
		long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		ServiceContext serviceContext = (ServiceContext) workflowContext.get("serviceContext");
		return ResumeLocalServiceUtil.updateStatus(userId, resourcePrimKey, status, serviceContext);
	}

}
