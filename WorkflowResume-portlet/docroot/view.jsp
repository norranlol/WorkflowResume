<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.resume.util.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.bean.BeanParamUtil"%>
<%@page import="com.resume.model.Resume"%>
<%@page import="com.resume.util.WebKeys"%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay" %>

<portlet:defineObjects />

<%
	Resume resume = (Resume) request.getAttribute(WebKeys.RESUME_ENTRY);

	long resourcePrimKey = BeanParamUtil.getLong(resume, request, "resumeId");
	int status = BeanParamUtil.getInteger(resume, request, "status", WorkflowConstants.STATUS_DRAFT);
%>

<portlet:actionURL name="addResume" var="addResumeURL"/>

<aui:workflow-status id="<%= String.valueOf(resourcePrimKey) %>" status="<%= status %>" />


<aui:form action="<%= addResumeURL.toString() %>" method="post">
	<aui:fieldset>
		<aui:input name="resumeId" type="hidden"/>
		<aui:input type="textarea" name="address" size="45">
			<aui:validator name="required"/>
			<aui:validator name="maxLength">100</aui:validator>		
		</aui:input>
		<aui:input name="phonenumber" size="45">
			<aui:validator name="required"/>	
			<aui:validator name="maxLength">11</aui:validator>	
		</aui:input>
		<aui:input name="position" size="45">
			<aui:validator name="required"/>
			<aui:validator name="maxLength">100</aui:validator>		
		</aui:input>
		<aui:input name="education" type="textarea" size="45">
			<aui:validator name="required"/>
		    <aui:validator name="maxLength">200</aui:validator>		
		</aui:input>
		<aui:input name="knowledge" type="textarea" size="45">
			<aui:validator name="required"/>
			<aui:validator name="maxLength">500</aui:validator>		
		</aui:input>
		<aui:input name="experience" type="textarea" size="45">
			<aui:validator name="required"/>
			<aui:validator name="maxLength">500</aui:validator>		
		</aui:input>
		<aui:input name="qualities" type="textarea" size="45">
			<aui:validator name="required"/>
			<aui:validator name="maxLength">500</aui:validator>		
		</aui:input>
		<aui:input name="additionally" type="textarea" size="45">
			<aui:validator name="maxLength">500</aui:validator>		
		</aui:input>
		<aui:button-row>
			<aui:button type="submit"/>
		</aui:button-row>
	</aui:fieldset>
</aui:form>

