CREATE TABLE MESSAGES
(
    MESSAGE_ID NUMBER not null
    constraint MESSAGE_PK
    primary key,
    CONTENT  VARCHAR2(50) not null
);
INSERT INTO MESSAGES (MESSAGE_ID, CONTENT)
VALUES (1, 'B25 LIKES BUTTONS');

INSERT INTO MESSAGES (MESSAGE_ID, CONTENT)
VALUES (2, 'B25 LIKES REPEATING');



SELECT *
FROM MESSAGES;

--UPDATING A ROW
UPDATE HR.MESSAGES t
SET t.CONTENT = 'B25 LIKES LEARNING'
WHERE t.MESSAGE_ID = 2;

--DELETING ROW
DELETE
FROM HR.MESSAGES
WHERE MESSAGE_ID = 2;

--HOW TO CLEAR EVERYTHING IN THE TABLE
--TRUNCATE

TRUNCATE TABLE MESSAGES;

--HOW TO MODIFY
alter table MESSAGES
    add SCORE INTEGER;

--HOW TO DELETE A TABLE
DROP TABLE MESSAGES;
