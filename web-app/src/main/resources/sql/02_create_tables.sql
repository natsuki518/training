CREATE TABLE IF NOT EXISTS user (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  address VARCHAR(255) NULL,
  phone VARCHAR(50) NULL,
  update_date DATETIME NOT NULL,
  create_date DATETIME NOT NULL,
  delete_date DATETIME NULL,
  PRIMARY KEY (id)
);

ALTER TABLE user ADD blood_type varchar(10) AFTER phone;

ALTER TABLE user ADD emergency_contact varchar(12) AFTER phone;
