BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, trucks, menus;

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL
);

CREATE TABLE trucks (
    id SERIAL PRIMARY KEY,
    name varchar(300) NOT NULL,
    foodtype varchar(50) NOT NULL,
    online boolean NOT NULL,
    truck_lat decimal,
    truck_long decimal,
    user_id int REFERENCES users(id)
);

CREATE TABLE menus (
    id SERIAL PRIMARY KEY,
    item_name varchar(100),
    description varchar(1000),
    truck_id int REFERENCES trucks(id)
);

COMMIT TRANSACTION;
