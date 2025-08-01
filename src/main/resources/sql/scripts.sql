create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

insert into users values('user','{noop}User@12345','1');
insert into authorities values('user','read');

insert into users values('admin','{bcrypt}$2a$12$SVDMZn/TBLx7ZPMHZgp5guls0a.Y7BD.XewPeRVr5Rnf3kjexdmf2','1');
insert into authorities values('admin','admin');

create table `customer`(
    `id` int NOT NULL AUTO_INCREMENT,
    `email` varchar(45) NOT NULL,
    `pwd` varchar(200) NOT NULL,
    `role` varchar(45) NOT NULL,
    PRIMARY KEY(`id`)

)

