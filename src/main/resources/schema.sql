CREATE TABLE course (
    course_id integer identity NOT NULL,
    title varchar(80) NOT NULL,
    description varchar(500) NOT NULL,
    link varchar(255) NOT NULL,
    CONSTRAINT pk_course_course_id PRIMARY KEY (course_id)
);