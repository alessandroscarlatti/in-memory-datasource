--this file will be used regardless of spring.datasource.platform
DROP SCHEMA SOUTH_POLE IF EXISTS;
CREATE SCHEMA SOUTH_POLE AUTHORIZATION sa;

CREATE TABLE IF NOT EXISTS SOUTH_POLE.PENGUIN (
 PENGUIN_ID bigint(20) NOT NULL AUTO_INCREMENT,
 PENGUIN_NAME varchar(200) NOT NULL,
 PRIMARY KEY (PENGUIN_ID)
);