CREATE DATABASE IF NOT EXISTS db1;
USE db1;

CREATE TABLE `users` (
 `id` INT AUTO_INCREMENT,
 `username` VARCHAR(50) NOT NULL,
 `password` VARCHAR(68) NOT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY (`username`)
);

-- Insert sample records (id will auto-generate as 1, 2, 3...)
INSERT INTO `users` (`username`, `password`) VALUES
('castle', '123'),
('a', '1234'),
('b', '123');


INSERT INTO `users` (`username`, `password`) VALUES('Amaan','$2a$10$tXM5XJ5zczcuxSRRJuPE3OBxo7PzBh7Q096cfaLBhJ.8KptOKMp9G');