# SQL 1
SELECT *
FROM user_profile;

# SQL 2
SELECT  device_id, gender, age, university
FROM user_profile;

# SQL 3
SELECT DISTINCT(university)
FROM user_profile;

# SQL 4
SELECT device_id
FROM user_profile
LIMIT 2;

# SQL 5
SELECT device_id AS user_infos_example
FROM user_profile
LIMIT 2;

# SQL 6
SELECT device_id, university
FROM user_profile
WHERE university = "北京大学";

# SQL 7
SELECT device_id, gender, age, university
FROM user_profile
WHERE age > 24;

# SQL 8
SELECT device_id, gender, age
FROM user_profile
WHERE age >= 20
AND age <= 23;

# SQL 9
SELECT device_id, gender, age, university
FROM user_profile
WHERE university NOT IN ("复旦大学");

# SQL 10
SELECT device_id, gender, age, university
FROM user_profile
WHERE age IS NOT NULL;
