<%@page import="com.resume.model.Details"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.resume.util.ActionUtil"%>
<%@page import="com.resume.model.Resume"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay" %>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<portlet:defineObjects/>

<%List<Details> detailsList = (List<Details>) renderRequest.getAttribute("detailsList"); %>

<liferay:search-container emptyResultsMessage="there-are-no-resumes" delta="20">
	<liferay:search-container-results>
		<%
			pageContext.setAttribute("results", detailsList);
			pageContext.setAttribute("total", detailsList.size());
		%>
	</liferay:search-container-results>
	<liferay:search-container-row className="com.resume.model.Details"
		keyProperty="detailsId" modelVar="details">
		<liferay:search-container-column-text 
			name="surname" property="surname"/>
		<liferay:search-container-column-text
			name="name" property="name"/>
		<liferay:search-container-column-text
			name="patronymic" property="patronymic"/>
		<liferay:search-container-column-text
			name="address" property="address"/>
		<liferay:search-container-column-text
			name="phonenumber" property="phonenumber"/>
		<liferay:search-container-column-text
			name="email" property="email"/>
		<liferay:search-container-column-text
			name="position" property="position"/>
		<liferay:search-container-column-text
			name="education" property="education"/>
		<liferay:search-container-column-text
			name="knowledge" property="knowledge"/>
		<liferay:search-container-column-text
			name="experience" property="experience"/>		
		<liferay:search-container-column-text
			name="qualities" property="quailities"/>
		<liferay:search-container-column-text
			name="additionally" property="additionally"/>																						
	</liferay:search-container-row>
	<liferay:search-iterator/>
</liferay:search-container>



