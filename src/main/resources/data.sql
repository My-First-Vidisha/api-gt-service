INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');


INSERT INTO `users` (`id`, `email`, `password`, `username`) 
VALUES ('1', 'dinesh@gmail.com', '$2a$10$1qPlQ/XEj5/yx5ySGjNZa../Nm2cWEP6Tz8ZIMIS40RvPrcwIXroO', 'dinesh');

INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES ('1', '2');
INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES ('1', '3');
