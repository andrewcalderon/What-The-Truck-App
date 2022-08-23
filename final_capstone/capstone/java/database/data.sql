BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.13027233297412, -115.1900573717724);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.28444458052776, -115.28359268475911);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', false);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.21754571399567, -115.09113532230523);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.22528382784651, -115.10292133859932);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.01282988016527, -114.96282729612355);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.03572377609703, -114.99127485937869);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.13027233297412, -115.1900573717724);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', false);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.036225892327906, -115.04728303395832);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.075306045101826, -115.18960477178862);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.181172167853795, -115.25675516005157);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.18101743713705, -115.24109062599906);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.195959157311364, -115.25625237176266);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.239637995861166, -115.17068268936936);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.24020953816084, -115.11380365993463);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.114902474224586, -115.17236246640142);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.144615756810516, -115.1572147320329);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.168555223241555, -115.14241263863862);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.15947307656747, -115.13656156554822);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.16369180347193, -115.14122149499303);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.1704287024982, -115.13968118358659);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.166875484674726, -115.1481385524319);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.16245434661329, -115.15105400048242);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.16191979185509, -115.15310785241219);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.160858243187576, -115.15264679668121);
INSERT INTO trucks (name, online, truck_lat, truck_long) VALUES ('', true, 36.15994277689116, -115.14693535465044);

COMMIT TRANSACTION;
