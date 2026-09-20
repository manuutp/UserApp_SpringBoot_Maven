DROP TABLE IF EXISTS user_entity;

CREATE TABLE `user_entity` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL,
  `user_address` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
);


INSERT INTO `user_entity` (`user_name`, `user_address`)
 VALUES ('Alfredo Leal', 'Santiago Oriente 342');
 
 INSERT INTO `user_entity` (`user_name`, `user_address`)
 VALUES ('Jose Pardo', 'Calle punta arenas 2233');
 
  INSERT INTO `user_entity` (`user_name`, `user_address`)
 VALUES ('Amelia Pino', 'Calle Conpcecion 344');