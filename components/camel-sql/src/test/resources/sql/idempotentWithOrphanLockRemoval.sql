-- Add DDL to create tables, views, indexes, etc needed by tests. These should match the expected database structure as it will appear in production.
SET DATABASE SQL SYNTAX PGS TRUE; -- tells HSQLDB that this schema uses MYSQL syntax
SET PROPERTY "sql.enforce_strict_size" FALSE;

CREATE TABLE CAMEL_MESSAGEPROCESSED (processorName VARCHAR(255), messageId VARCHAR(100), createdAt TIMESTAMP);

ALTER TABLE CAMEL_MESSAGEPROCESSED ADD PRIMARY KEY (processorName, messageId);


INSERT INTO CAMEL_MESSAGEPROCESSED VALUES ('APP_1', 'FILE_1', CURRENT_TIMESTAMP);

INSERT INTO CAMEL_MESSAGEPROCESSED VALUES ('APP_1', 'FILE_2',TIMESTAMPADD(SQL_TSI_MINUTE, -2, CURRENT_TIMESTAMP));

INSERT INTO CAMEL_MESSAGEPROCESSED VALUES ('APP_1', 'FILE_3',TIMESTAMPADD(SQL_TSI_MINUTE, -5, CURRENT_TIMESTAMP));
