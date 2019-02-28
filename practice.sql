SELECT year, number
FROM babies
WHERE name = 'Lillian';

SELECT year, number
FROM babies
WHERE name = 'Lillian';

SELECT name, gender, number 
FROM babies
WHERE year = 1880
ORDER BY number DESC
LIMIT 10;

 SELECT * 
 FROM nomnom
 WHERE cuisine = 'Italian' AND price = '$$$';

 SELECT *
 FROM nomnom
 WHERE name LIKE '%meatball%';

  SELECT * 
 FROM nomnom 
 WHERE health IS NULL;

 SELECT title, publisher
FROM news 
ORDER BY title ASC;

 SELECT *
 FROM news
 WHERE title like '%bitcoin%';

 SELECT * 
 FROM news 
 WHERE category = 'b'
 ORDER BY timestamp DESC
 LIMIT 20;