CREATE TABLE IF NOT EXISTS customer (
	id INTEGER NOT NULL PRIMARY KEY,
	name VARCHAR(100) NULL,
	birth_date DATE NULL,
	email VARCHAR(50 NULL,
	document VARCHAR(50) NULL,
	id_adress INTEGER NULL,
	phone_number VARCHAR(50) NULL,
	photo BLOB NULL,
	id_adress INTEGER NULL,
	CONSTRAINT fk_customer_adress FOREIGN KEY (id_adress) REFERENCES adress (id)  ON UPDATE RESTRICT ON DELETE CASCADE
);
