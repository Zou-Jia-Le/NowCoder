# SQL 11
SELECT device_id, gender, age, university, gpa
FROM user_profile
WHERE gender = "male"
AND gpa > 3.5;

# SQL 12
SELECT device_id, gender, age, university, gpa
FROM user_profile
WHERE university = "北京大学"
OR gpa > 3.7;

# SQL 13
SELECT device_id, gender, age, university, gpa
FROM user_profile
WHERE university
IN ("北京大学", "复旦大学", "山东大学");

# SQL 14
SELECT device_id, gender, age, university, gpa
FROM user_profile
WHERE (gpa > 3.5 AND university = "山东大学")
OR (gpa > 3.8 AND university = "复旦大学");

# SQL 15
SELECT device_id, age, university
FROM user_profile
WHERE university LIKE "%北京%";

# SQL 16-1
SELECT MAX(gpa) AS gpa
FROM user_profile
WHERE university = "复旦大学";

# SQL 16-2
SELECT gpa
FROM user_profile
WHERE university = "复旦大学"
ORDER BY gpa DESC
LIMIT 1;

# SQL 17
SELECT
    COUNT(gender) AS male_num, 
    ROUND(AVG(gpa),1) AS avg_gpa
FROM user_profile
WHERE gender = "male";

# SQL 18
SELECT 
    gender, 
    university, 
    COUNT(*) AS user_num, 
    ROUND(AVG(active_days_within_30), 1) AS avg_active_day, 
    ROUND(AVG(question_cnt), 1) AS avg_question_cnt
FROM 
    user_profile
GROUP BY 
    gender, university
ORDER BY 
    gender, university;

# SQL 19
SELECT 
    university,
    ROUND(AVG(question_cnt),3) AS avg_question_cnt,
    ROUND(AVG(answer_cnt),3) AS avg_answer_cnt
FROM user_profile
GROUP BY university
HAVING avg_question_cnt < 5
OR avg_answer_cnt < 20;

# SQL 20
SELECT
    university,
    ROUND(AVG(question_cnt),4) AS avg_question_cnt
FROM user_profile
GROUP BY university
ORDER BY avg_question_cnt;








