CREATE TABLE IF NOT EXISTS students_tbl (id bigserial, name VARCHAR(255), mark FLOAT, PRIMARY KEY (id));
INSERT INTO students_tbl (name, mark) VALUES ('Bob', 5);
INSERT INTO students_tbl (name, mark) VALUES ('Dob', 4.5);
INSERT INTO students_tbl (name, mark) VALUES ('Dog', 3);

