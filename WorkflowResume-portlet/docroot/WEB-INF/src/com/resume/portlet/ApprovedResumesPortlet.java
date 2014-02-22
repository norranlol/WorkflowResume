package com.resume.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.resume.model.Details;
import com.resume.model.Resume;
import com.resume.service.DetailsLocalServiceUtil;
import com.resume.util.ActionUtil;

public class ApprovedResumesPortlet extends MVCPortlet {
 
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		List<Resume> listOfResumes = ActionUtil.getAllResumesWithApprovedStatus();
		List<Details> listOfDetails = new ArrayList<Details>();
		for (Resume resume : listOfResumes){
			try {
				List<Details> temp = DetailsLocalServiceUtil.getDetailsOfResume(resume.getResumeId());
				listOfDetails.addAll(temp);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		renderRequest.setAttribute("detailsList", listOfDetails);
		super.render(renderRequest, renderResponse);
	}

}

