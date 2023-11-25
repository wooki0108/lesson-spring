insert into lesson (id, classroom, name, no) values (1, '101', '자바', 'LESSON-C01');
insert into lesson_detail(id, week, content, lesson_id) values (1, 1, 'jvm 구조', 1);
insert into lesson_detail(id, week, content, lesson_id) values (2, 2, '클래스와 객체', 1);
insert into lesson_detail(id, week, content, lesson_id) values (3, 3, '메서드', 1);

insert into lesson (id, classroom, name, no) values (2, '102', '자료구조', 'LESSON-C02');
insert into lesson_detail(id, week, content, lesson_id) values (4, 1, 'Map', 2);
insert into lesson_detail(id, week, content, lesson_id) values (5, 2, 'Stack', 2);
insert into lesson_detail(id, week, content, lesson_id) values (6, 3, 'Queue', 2);

insert into lesson (id, classroom, name, no) values (3, '103', '알고리즘', 'LESSON-C03');
insert into lesson_detail(id, week, content, lesson_id) values (7, 1, '투포인터', 3);
insert into lesson_detail(id, week, content, lesson_id) values (8, 2, 'BFS', 3);
insert into lesson_detail(id, week, content, lesson_id) values (9, 3, 'DFS', 3);

insert into student(id, name , no) values (1, '철수', 'STD-01');
insert into student(id, name , no) values (2, '수희', 'STD-02');
insert into student(id, name , no) values (3, '영철', 'STD-03');

insert into lesson_student(lesson_id, student_id) values (1, 1);
insert into lesson_student(lesson_id, student_id) values (1, 3);

insert into lesson_student(lesson_id, student_id) values (2, 2);
insert into lesson_student(lesson_id, student_id) values (2, 3);

insert into lesson_student(lesson_id, student_id) values (3, 1);
insert into lesson_student(lesson_id, student_id) values (3, 2);




