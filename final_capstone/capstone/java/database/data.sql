BEGIN TRANSACTION;

--INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
--INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

INSERT INTO trucks (name, foodtype, online, truck_lat, truck_long) VALUES ('Foodtruck1', 'Chinese', true, 36.13027233297412, -115.1900573717724);
INSERT INTO trucks (name, foodtype, online, truck_lat, truck_long) VALUES ('Foodtruck2', 'Mexican', true, 36.28444458052776, -115.28359268475911);
INSERT INTO trucks (name, foodtype, online) VALUES ('Foodtruck3', 'Indian', false);
INSERT INTO trucks (name, foodtype, online, truck_lat, truck_long) VALUES ('Foodtruck4', 'Vegan', true,  36.21754571399567, -115.09113532230523);
INSERT INTO trucks (name, foodtype, online, truck_lat, truck_long) VALUES ('Foodtruck5', 'Hot sauce', true,  36.22528382784651, -115.10292133859932);
INSERT INTO trucks (name, foodtype, online, truck_lat, truck_long) VALUES ('Foodtruck6', 'Korean', true,  36.01282988016527, -114.96282729612355);
INSERT INTO trucks (name, foodtype, online) VALUES ('Foodtruck7', 'Spicy', false);


COMMIT TRANSACTION;
