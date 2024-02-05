INSERT INTO tb_user (name, email, password) VALUES ('Jhon Doe', 'jhondoe@gmail.com', '$2a$10$RnNpOUb209T9pgyfLxN1W.HLRm9MejhtR0l6dj0lEAycqD/lQI/di');
INSERT INTO tb_user (name, email, password) VALUES ('Dexter Lorian', 'dexterlorian@gmail.com', '$2a$10$RnNpOUb209T9pgyfLxN1W.HLRm9MejhtR0l6dj0lEAycqD/lQI/di');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);