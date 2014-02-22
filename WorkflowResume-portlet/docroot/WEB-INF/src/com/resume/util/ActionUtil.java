package com.resume.util;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.xml.soap.Detail;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.resume.model.Details;
import com.resume.model.Resume;
import com.resume.model.impl.DetailsImpl;
import com.resume.model.impl.ResumeImpl;
import com.resume.service.DetailsLocalServiceUtil;
import com.resume.service.ResumeLocalServiceUtil;

public class ActionUtil {
	
	public static String[] results;
	
	public static Resume resumeFromRequest(ActionRequest request, ThemeDisplay themeDisplay){
		ResumeImpl resume = new ResumeImpl();
		resume.setCompanyId(themeDisplay.getCompanyId());
		resume.setGroupId(themeDisplay.getScopeGroupId());
		resume.setUserId(themeDisplay.getUserId());
		resume.setResumeId(ParamUtil.getLong(request, "resumePrimKey"));
		resume.setResumeDate(new Date());
		return resume;
	}	
	
	public static String createResumeText(ActionRequest request, ThemeDisplay themeDisplay) throws SystemException, PortalException{
		String resumeText = "";
		String[] namesOfAttr = new String[]{ "surname", "name", "patronymic", "address", 
				"phonenumber", "email", "position", "education", "knowledge", "experience",
				"qualities","additionally"};
		results = new String[namesOfAttr.length];
		long userId = themeDisplay.getUserId();
		User user = UserLocalServiceUtil.getUser(userId);
		String surname = user.getLastName();
		String name = user.getFirstName();
		String patronymic = user.getMiddleName();
		String email = user.getEmailAddress();
		for (int i = 0; i < results.length; i++)
			results[i] = request.getParameter(namesOfAttr[i]);
		results[0] = surname;
		results[1] = name;
		results[2] = patronymic;
		results[5] = email;
		String localeLanguage = themeDisplay.getLocale().toString();
		InternationalizationClass internationalization = new InternationalizationClass();
		namesOfAttr = internationalization.generateNamesOfAttributes(localeLanguage, namesOfAttr.length);
		for (int i = 0; i < results.length; i++)
			resumeText += makeWholeRow(namesOfAttr[i], results[i]);
		return resumeText;
	}
	
	public static Details createDetailsObject(String[] results) throws SystemException{
		DetailsImpl detail = new DetailsImpl();
		detail.setSurname(results[0]);
		detail.setName(results[1]);
		detail.setPatronymic(results[2]);
		detail.setAddress(results[3]);
		detail.setPhonenumber(results[4]);
		detail.setEmail(results[5]);
		detail.setPosition(results[6]);
		detail.setEducation(results[7]);
		detail.setKnowledge(results[8]);
		detail.setExperience(results[9]);
		detail.setQuailities(results[10]);
		detail.setAdditionally(results[11]);
		return detail;
	}
	
	private static String makeWholeRow(String name, String value){
		String result = name + ": " + value + ".  ";
		return result;
	}
	
	public static List<Resume> getAllResumesWithApprovedStatus(){
		List<Resume> resumes;
		try{
			resumes = ResumeLocalServiceUtil.getAllResumesWithApprovedStatus();
		} catch (SystemException e){
			resumes = Collections.EMPTY_LIST;
		}
		return resumes;
	}
}
