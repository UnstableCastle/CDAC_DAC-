CREATE DATABASE IF NOT EXISTS employee_directory;
USE employee_directory;

-- Drop tables in correct order due to Foreign Key constraints
DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;

-- Create users table
CREATE TABLE `users` (
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(68) NOT NULL,
  `enabled` TINYINT NOT NULL,
  PRIMARY KEY (`username`)
);


CREATE TABLE `users` (
  `id` INT AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(68) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`username`)
);
-- Insert sample users castle 123 other test123
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
('CASTLE','{bcrypt}$2a$10$OO/cImocO6ii7QKLalHgwOQZmeHQhTsRs1hew/zwphJ.Eo8YhuNuq', 1),
('A', '{bcrypt}$2a$10$JuD1q7NysgWhXhDMjDB7kOHXe8ZEp5oCIg9hH3qWx.W8U1bLKd8Wq', 1),
('B', '{bcrypt}$2a$10$JuD1q7NysgWhXhDMjDB7kOHXe8ZEp5oCIg9hH3qWx.W8U1bLKd8Wq', 0),
('bob_builder', '{noop}construct_2026', 1),
('charlie_brown', '{noop}snoopy_fan!', 0),
('dana_scully', '{noop}the_truth_is_out', 1),
('evan_wright', '{noop}secure_pass99', 0);

-- Create authorities table
CREATE TABLE `authorities` (
  `username` VARCHAR(50) NOT NULL,
  `authority` VARCHAR(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`, `authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
);

-- Insert sample roles
INSERT INTO `authorities` (`username`, `authority`) VALUES
('CASTLE', 'ROLE_ADMIN'),
('A', 'ROLE_EMPLOYEE'),
('B', 'ROLE_MANAGER'),
('bob_builder', 'ROLE_EMPLOYEE'),
('charlie_brown', 'ROLE_EMPLOYEE'),
('dana_scully', 'ROLE_EMPLOYEE'),
('evan_wright', 'ROLE_EMPLOYEE');