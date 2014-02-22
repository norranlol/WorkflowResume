package com.resume.asset;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portlet.asset.model.BaseAssetRenderer;
import com.resume.model.Resume;

public class ResumeAssetRenderer extends BaseAssetRenderer {
	
	private Resume _resume;
	
	public ResumeAssetRenderer(Resume resume){
		_resume = resume;
	}
	
	@Override
	public long getClassPK() {
		return _resume.getResumeId();
	}
	
	@Override
	public long getGroupId() {
		return _resume.getGroupId();
	}
	
	@Override
	public String getSummary(Locale arg0) {
		return _resume.getResumeText();
	}
	
	@Override
	public String getTitle(Locale arg0) {
		return "Resume";
	}
	
	@Override
	public long getUserId() {
		return _resume.getUserId();
	}
	
	@Override
	public String getUuid() {
		return _resume.getUuid();
	}
	
	
	@Override
	public String getClassName() {
		return Resume.class.getName();
	}

	@Override
	public String render(RenderRequest request, RenderResponse response, String template)
			throws Exception {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			return "/view.jsp";
		}
		else
		{
			return null;
		}
	}

	@Override
	public String getUserName() {
		return null;
	}
}
