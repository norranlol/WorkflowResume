create table resume_Details (
	detailsId LONG not null primary key,
	surname VARCHAR(75) null,
	name VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	address VARCHAR(75) null,
	phonenumber VARCHAR(75) null,
	email VARCHAR(75) null,
	position VARCHAR(75) null,
	education VARCHAR(75) null,
	knowledge VARCHAR(75) null,
	experience VARCHAR(75) null,
	quailities VARCHAR(75) null,
	additionally VARCHAR(75) null,
	resumeId LONG
);

create table resume_Resume (
	uuid_ VARCHAR(75) null,
	resumeId LONG not null primary key,
	resumeDate DATE null,
	resumeText VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG
);