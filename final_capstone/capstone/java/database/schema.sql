BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, truck, menu;

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL
);

CREATE TABLE truck (
    id serial PRIMARY KEY,
    name varchar(300) NOT NULL,
    online boolean NOT NULL,
    logo varchar(1000) NOT NULL,
    truck_lat decimal NOT NULL,
    truck_long decimal NOT NULL,
    user_id int REFERENCES users(id)
);

CREATE TABLE menu (
    id SERIAL PRIMARY KEY,
    item_name varchar(100),
    description varchar(1000),
    truck_id int REFERENCES truck(id)
);

COMMIT TRANSACTION;
