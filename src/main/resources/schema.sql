create table users (
  username varchar(256),
  password varchar(256),
  enabled boolean
);

create table authorities (
  username varchar(256),
  authority varchar(256)
);

INSERT INTO authorities(username, authority) VALUES('admin', 'ADMIN');
INSERT INTO users(username, password, enabled) VALUES('admin', 'admin', true);