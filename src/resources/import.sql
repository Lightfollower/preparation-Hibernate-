CREATE TABLE IF NOT EXISTS students_tbl (client_id bigserial, name_fld VARCHAR(255), mark_fld FLOAT, PRIMARY KEY (client_id));
INSERT INTO students_tbl (name_fld, mark_fld) VALUES ('Bob', 5);
INSERT INTO students_tbl (name_fld, mark_fld) VALUES ('Dob', 4.5);
INSERT INTO students_tbl (name_fld, mark_fld) VALUES ('Dog', 3);

