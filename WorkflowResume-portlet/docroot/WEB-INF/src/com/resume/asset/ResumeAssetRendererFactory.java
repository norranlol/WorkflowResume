package com.resume.asset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;
import com.resume.model.Resume;
import com.resume.service.ResumeLocalServiceUtil;

public class ResumeAssetRendererFactory extends BaseAssetRendererFactory {

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type)
			throws PortalException, SystemException {
		Resume resume = ResumeLocalServiceUtil.getResume(classPK);
		return new ResumeAssetRenderer(resume);
	}

	@Override
	public String getClassName() {
		return Resume.class.getName();
	}

	@Override
	public String getType() {
		return "article";
	}

}
