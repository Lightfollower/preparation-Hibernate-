CREATE TABLE IF NOT EXISTS students (id bigserial, name VARCHAR(255), mark FLOAT, PRIMARY KEY (id));
INSERT INTO students (name, mark) VALUES ('Bob', 5);
INSERT INTO students (name, mark) VALUES ('Dob', 4.5);
INSERT INTO students (name, mark) VALUES ('Dog', 3);

