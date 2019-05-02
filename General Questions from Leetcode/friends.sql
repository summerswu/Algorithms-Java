CREATE TABLE friends (
   id INTEGER,
   name TEXT,
   birthday DATE
);
  
INSERT INTO friends (id, name, birthday) 
VALUES (1, 'Jane Doe', '1990-05-30');

INSERT INTO friends (id, name, birthday) 
VALUES (2, 'BFF One', 'YYYY-MM-DD');

INSERT INTO friends (id, name, birthday) 
VALUES (3, 'BFF Two', 'YYYY-MM-DD');
  
  UPDATE friends
  SET name = 'Jane Smith'
  WHERE id = 1;
  
  ALTER TABLE friends
  ADD COLUMN email TEXT;
  
  UPDATE friends 
  SET email 
  
  SELECT * 
  FROM friends;