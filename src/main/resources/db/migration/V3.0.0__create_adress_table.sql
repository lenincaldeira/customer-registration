CREATE TABLE IF NOT EXISTS adress (
	id INTEGER NOT NULL PRIMARY KEY,
	public_place VARCHAR(100) NULL,
	house_number INTEGER NULL, 
	complement VARCHAR(100) NULL,
	district VARCHAR(100) NULL,
	postal_code VARCHAR(100) NULL,
	city VARCHAR(100) NULL,
	state VARCHAR(100) NULL,
	id_customer INTEGER NULL,
);
