USE my_db;

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO my_db.users (username, password, enabled)
VALUES
	('zaur', '{bcrypt}$2a$10$e/c0aZAfzmjA1HAdI6fpPe/WFzKxm8EodsgMFj8Yne2ywUMv5fewC', 1),
	('elena', '{bcrypt}$2a$10$PP2fhQXWoTeZXhRtxHYVG.D/8jF5gqRqmxGly9usk1qsCW8T9Oncy', 1),
	('ivan', '{bcrypt}$2a$10$THMfY3sCXOUIIYkVeV6WD.zEwvNoJPdz.lexp0yV306MLtW/uPMQa', 1);
    
INSERT INTO my_db.authorities (username, authority)
VALUES
	('zaur', 'ROLE_EMPLOYEE'),
	('elena', 'ROLE_HR'),
    ('ivan', 'ROLE_HR'),
	('ivan', 'ROLE_MANAGER');
    
    