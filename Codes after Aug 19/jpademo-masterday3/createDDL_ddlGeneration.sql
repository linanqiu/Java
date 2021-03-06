CREATE TABLE car (car_id INTEGER NOT NULL, COLOR VARCHAR(255), MAKE VARCHAR(255), MODEL VARCHAR(255), tag_number VARCHAR(255), YEAR VARCHAR(255), user_id INTEGER, PRIMARY KEY (car_id))
CREATE TABLE user_info (user_id INTEGER NOT NULL, AGE INTEGER, CREATEDDATE TIMESTAMP, EMAIL VARCHAR(255), first_name VARCHAR(255), GENDER VARCHAR(255), IMAGEDATA BYTEA, last_name VARCHAR(255), PHONE VARCHAR(255), user_name VARCHAR(255), XMLTEXT TEXT, addr_line_1 VARCHAR(255), addr_line_2 VARCHAR(255), user_city VARCHAR(255), COUNTRY VARCHAR(255), user_state VARCHAR(255), zipcode VARCHAR(255), car_id INTEGER, PRIMARY KEY (user_id))
CREATE TABLE password_details (user_id INTEGER NOT NULL, PASSWORD VARCHAR(255), sec_ans_1 VARCHAR(255), sec_ans_2 VARCHAR(255), sec_ques_1 VARCHAR(255), sec_ques_2 VARCHAR(255), PRIMARY KEY (user_id))
ALTER TABLE car ADD CONSTRAINT FK_car_user_id FOREIGN KEY (user_id) REFERENCES user_info (user_id)
ALTER TABLE user_info ADD CONSTRAINT FK_user_info_car_id FOREIGN KEY (car_id) REFERENCES car (car_id)
ALTER TABLE password_details ADD CONSTRAINT FK_password_details_user_id FOREIGN KEY (user_id) REFERENCES user_info (user_id)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
CREATE SEQUENCE user_seq START WITH 1
