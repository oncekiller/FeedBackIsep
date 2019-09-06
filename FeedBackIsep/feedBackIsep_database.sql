DROP DATABASE IF EXISTS `feedbackisep`;

CREATE DATABASE feedbackisep;
USE feedbackisep;

CREATE TABLE `users`
(
  id  bigint UNIQUE KEY AUTO_INCREMENT,
  username  varchar(255) NOT NULL,
  firstname varchar(255) NOT NULL,
  lastname  varchar(255) NOT NULL,
  status varchar(255),
  isep_id   bigint          NOT NULL,
  mail      varchar(255) NOT NULL,
  password  varchar(255) NOT NULL,
  avatar    varchar(255) NOT NULL,
  color     varchar(255) NOT NULL,
  parent_id bigint,
  enabled   boolean   NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;


CREATE TABLE user_courses
(
  id  bigint UNIQUE KEY AUTO_INCREMENT,
  user_id   bigint NOT NULL,
  course_id bigint NOT NULL

);

  CREATE TABLE courses
(
  id  bigint PRIMARY KEY AUTO_INCREMENT,
  teacher_id  bigint NOT NULL,
  date_time  datetime NOT NULL,
  duration     bigint NOT NULL,
  material_id bigint NOT NULL
);

CREATE TABLE course_documents
(
  id        bigint PRIMARY KEY AUTO_INCREMENT,
  name      VARCHAR(255) NOT NULL,
  document  VARCHAR(255) NOT NULL,
  userPost_id   bigint,
  course_id bigint  NOT NULL
);

CREATE TABLE course_materials
(
  id   bigint PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE `comments`
(
  id             bigint PRIMARY KEY AUTO_INCREMENT,
  user_id        bigint          NOT NULL,
  course_id      bigint          NOT NULL,
  content        VARCHAR(255) NOT NULL,
  date_time     datetime     NOT NULL,
  number_like    bigint NOT NULL,
  number_dislike bigint NOT NULL,
  parent_id      bigint
);


CREATE TABLE messages
(
  id             bigint PRIMARY KEY AUTO_INCREMENT,
  conversation_id bigint          NOT NULL,
  is_from_sender  boolean      NOT NULL,
  content         VARCHAR(255) NOT NULL,
  is_read          boolean      NOT NULL,
  date_time      datetime     NOT NULL
);

CREATE TABLE conversations
(
  id         bigint PRIMARY KEY AUTO_INCREMENT,
  from_id    bigint          NOT NULL,
  to_id      bigint          NOT NULL,
  object    VARCHAR(255) NOT NULL,
  date_time datetime     NOT NULL
);

INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'gfessar', 'Gregoire', 'Fessar', 'ROLE_STUDENT','1', 'gregoire.fessard@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKp8lrDQAr4FytEknomklSTAUYtGLVg1IJRC0YtoAZg+XbnGEkabgSlk6R+6AfRqAWjFoxaMGrBiLAAEAAA//8YEgdLUEr9gAAAAABJRU5ErkJggg==',
        '#111111', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'ktan', 'Kevin', 'TAN', 'ROLE_STUDENT','2', 'kevin.tan@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGLp3T+ZgRQwLTuBJPVMJKkmA4xaMGrBqAWjFoxaQA3A+Ej8IUkaHtoJkaR+6AfRqAWjFoxaMGrBiLAAEAAA//8FnwaNkNlVEgAAAABJRU5ErkJggg==',
        '#222222', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'acanard', 'Antoine', 'Canard', 'ROLE_STUDENT','3', 'antoine.canard@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#a6e590', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'aveloso', 'Alex', 'Veloso', 'ROLE_STUDENT','4', 'alex.veloso@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#444444', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'ccisse', 'Cameron', 'Cisse', 'ROLE_STUDENT','5', 'cameron.cisse@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#555555', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'mnguyen', 'Mathieu', 'Nguyen','ROLE_TEACHER', '6', 'mathieu.nguyen@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#666666', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'zkaziaoul', 'Zakia', 'Kaziaoul', 'ROLE_TEACHER','7', 'zakia.kaziaoul@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#777777', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'adubernet', 'Alice', 'Dubernet', 'ROLE_TEACHER','8', 'alice.dubernet@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#888888', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'mpepineau', 'Maurice', 'Pepineau', 'ROLE_TEACHER','9', 'maurice.pepineau@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#999999', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'jleite', 'Jean Charles', 'Leite', 'ROLE_TEACHER','10', 'jeancharles.leite@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#aaaaaa', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'aplatel', 'Adriana', 'Platel', 'ROLE_TEACHER','11', 'adriana.platel@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#bbbbbb', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'eabgrall', 'Emma', 'Abgrall', 'ROLE_TEACHER','12', 'emma.abgrall@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#cccccc', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'jlemee', 'Jacky', 'Lemee', 'ROLE_TEACHER','13', 'jacky.lemee@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#dddddd', NULL, 1);
INSERT INTO `users` (`id`, `username`, `firstname`, `lastname`, `status`,`isep_id`, `mail`, `password`, `avatar`, `color`,
                     `parent_id`, `enabled`)
VALUES (NULL, 'aadmin', 'admin', 'admin', 'ROLE_TEACHER','14', 'admin.admin@isep.fr', '{bcrypt}$2a$10$rAAV9h2YROT29TvBcDu86eNyf5g5e9R1GGB25RHreYfUNdM1Jzwai',
        'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAARklEQVR4nGKZZXGLgRTQsYOZJPVMJKkmA4xaMGrBqAWjFoxaQA3AwvLOhiQNL5dGkKR+6AfRqAWjFoxaMGrBiLAAEAAA//9b4QZIR8FaGQAAAABJRU5ErkJggg==',
        '#eeeeee', NULL, 1);


INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Genie logiciel');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Cybersecurite');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Architecture des SI');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Analyse Geopolitique');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Technologies Web');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Big Data');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Espagnol');
INSERT INTO `course_materials` (`id`, `name`)
VALUES (NULL, 'Anglais');

INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '6', '2019-04-01 09:00:00', '180', '5');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '8', '2019-04-01 17:30:00', '180', '4');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '9', '2019-04-02 09:00:00', '180', '6');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '7', '2019-04-02 13:00:00', '180', '1');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '10', '2019-04-02 16:30:00', '180', '3');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '11', '2019-04-03 15:15:00', '120', '7');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '12', '2019-04-04 10:30:00', '120', '8');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '13', '2019-04-05 09:00:00', '180', '2');

INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '6', '2019-06-10 09:00:00', '180', '5');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '8', '2019-06-10 17:30:00', '150', '4');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '9', '2019-06-11 09:00:00', '180', '6');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '7', '2019-06-11 13:00:00', '180', '1');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '10', '2019-06-11 16:30:00', '180', '3');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '11', '2019-06-12 15:15:00', '120', '7');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '12', '2019-06-13 10:30:00', '120', '8');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '13', '2019-06-14 09:00:00', '180', '2');

INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '6', '2019-06-17 09:00:00', '180', '5');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '8', '2019-06-17 17:30:00', '150', '4');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '9', '2019-06-18 09:00:00', '180', '6');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '7', '2019-06-18 13:00:00', '180', '1');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '10', '2019-06-18 16:30:00', '180', '3');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '11', '2019-06-19 15:15:00', '120', '7');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '12', '2019-06-20 10:30:00', '120', '8');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '13', '2019-06-21 09:00:00', '180', '2');

INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '6', '2019-06-24 09:00:00', '180', '5');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '8', '2019-06-24 17:30:00', '150', '4');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '9', '2019-06-25 09:00:00', '180', '6');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '7', '2019-06-25 13:00:00', '180', '1');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '10', '2019-06-25 16:30:00', '180', '3');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '11', '2019-06-26 15:15:00', '120', '7');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '12', '2019-06-27 10:30:00', '120', '8');
INSERT INTO `courses` (`id`, `teacher_id`, `date_time`, `duration`, `material_id`)
VALUES (NULL, '13', '2019-06-28 09:00:00', '180', '2');

INSERT INTO `comments` (`id`, `user_id`, `course_id`, `content`, `date_time`, `number_like`, `number_dislike`,
                        `parent_id`)
VALUES (NULL, '1', '1', 'Ce cours est nul', '2019-05-21 13:02:00', '35', '0', NULL);

INSERT INTO `conversations` (`id`, `from_id`, `to_id`, `object`, `date_time`)
VALUES (NULL, '2', '1', 'Avis sur mon cours', '2019-05-21 18:08:07');

INSERT INTO `messages` (`id`, `conversation_id`, `is_from_sender`, `content`, is_read, `date_time`)
VALUES (NULL, '1', true, 'vous etes pas bien', true, '2019-05-21 18:08:07');

INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '1');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '2');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '3');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '4');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '5');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '6');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '7');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '8');

INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '9');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '10');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '11');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '12');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '13');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '14');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '15');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '16');

INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '17');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '18');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '19');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '20');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '21');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '22');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '23');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '24');

INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '25');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '26');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '27');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '28');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '29');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '30');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '31');
INSERT INTO `user_courses` (`id`, `user_id`, `course_id`)
VALUES (NULL, '3', '32');

INSERT INTO `course_documents`(`id`, `name`, `document` , `userPost_id` , `course_id`) 
VALUES (NULL, 'documentName', 'Test', '1' , '1')
