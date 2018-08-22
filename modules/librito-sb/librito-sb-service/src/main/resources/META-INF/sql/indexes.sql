create index IX_9E4A5F11 on LB_Entry (groupId, guestbookId);
create index IX_6A047603 on LB_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CB28A145 on LB_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_72C1633 on LB_Librto (groupId);
create index IX_62068A8B on LB_Librto (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D03637CD on LB_Librto (uuid_[$COLUMN_LENGTH:75$], groupId);