create table t_student
(
    id      int auto_increment comment '学生 id'
        primary key,
    name    varchar(10) not null comment '姓名',
    address varchar(255) not null comment '所在地址'
)
    comment '学生表' charset = utf8mb4;