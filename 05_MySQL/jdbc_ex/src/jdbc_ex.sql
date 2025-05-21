create table users(
    id varchar(12) not null primary key,
    password varchar(12) not null,
    name varchar(30) not null,
    role varchar(6) not null
);

insert into users(id, password, name, role)
values('quest', 'quest123', '방문자', 'USER');

insert into users(id, password, name, role)
values ('admin', 'admin123', '관리자', 'ADMIN');

insert into users(id, password, name, role)
values ('member', 'member123', '일반회원', 'USER');

select * from users;