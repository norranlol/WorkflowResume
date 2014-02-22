package com.resume.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.xml.soap.Detail;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.resume.model.Details;
import com.resume.model.Resume;
import com.resume.service.DetailsLocalServiceUtil;
import com.resume.service.ResumeLocalServiceUtil;
import com.resume.util.ActionUtil;
import com.resume.util.InternationalizationClass;
import com.resume.util.WebKeys;

public class ResumePortlet extends MVCPortlet {
	
	public void addResume(ActionRequest request, ActionResponse response) throws PortalException,SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Resume resume = ActionUtil.resumeFromRequest(request,themeDisplay);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Resume.class.getName(), request);
		resume.setResumeText(ActionUtil.createResumeText(request, themeDisplay));
		resume = ResumeLocalServiceUtil.addResume(resume, resume.getUserId(), serviceContext);
		Details details = ActionUtil.createDetailsObject(ActionUtil.results);
		details.setResumeId(resume.getResumeId());
		DetailsLocalServiceUtil.addDetails(details, resume.getResumeId());
	}
	


}
