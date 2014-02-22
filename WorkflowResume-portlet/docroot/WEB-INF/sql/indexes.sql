create index IX_E28EF1D7 on resume_Details (detailsId);
create index IX_DE8ED2B6 on resume_Details (email);
create index IX_E1BC1372 on resume_Details (resumeId);

create index IX_5262F663 on resume_Resume (companyId);
create index IX_D7EBB9A5 on resume_Resume (groupId);
create index IX_497C838B on resume_Resume (groupId, status);
create index IX_6BD413 on resume_Resume (resumeText);
create index IX_397D716F on resume_Resume (uuid_);
create index IX_83E2A759 on resume_Resume (uuid_, companyId);
create unique index IX_1C6F301B on resume_Resume (uuid_, groupId);