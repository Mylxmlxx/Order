create table if not exists dish_inventory
(
    dish_id        int                                 not null comment '菜品ID'
        primary key,
    stock_quantity int                                 null comment '库存量',
    sales_quantity int       default 0                 null comment '销售量',
    shelf_time     timestamp default CURRENT_TIMESTAMP null comment '上架时间'
);

create table if not exists dishes
(
    dish_id     int auto_increment comment '菜品ID'
        primary key,
    dish_name   varchar(50)    null comment '菜品名称',
    price       decimal(10, 2) null comment '价格',
    taste       varchar(50)    null comment '口味',
    description text           null comment '描述'
);

create table if not exists orders
(
    order_id       int auto_increment comment '订单ID'
        primary key,
    user_id        int                                 null comment '用户ID',
    order_time     timestamp default CURRENT_TIMESTAMP null comment '下单时间',
    payment_method varchar(20)                         null comment '支付方式',
    order_status   varchar(20)                         null comment '订单状态'
);

create table if not exists table_order_relations
(
    table_order_id   int auto_increment comment '餐桌订单ID'
        primary key,
    table_id         int  null comment '餐桌ID',
    order_id         int  null comment '订单ID',
    number_of_diners int  null comment '就餐人数',
    note             text null comment '备注'
);

create table if not exists tables
(
    table_id             int auto_increment comment '餐桌ID'
        primary key,
    seating_capacity     int          null comment '容纳人数',
    location_description varchar(100) null comment '位置描述'
);

create table if not exists user_order_relations
(
    user_order_id int auto_increment comment '用户订单ID'
        primary key,
    user_id       int  null comment '用户ID',
    order_id      int  null comment '订单ID',
    note          text null comment '备注'
);

create table if not exists users
(
    user_id           int auto_increment comment '用户ID'
        primary key,
    username          varchar(50)                         null comment '用户名',
    user_password     varchar(20)                         null comment '用户密码',
    phone_number      varchar(20)                         null comment '电话号码',
    email             varchar(50)                         null comment '邮箱',
    role              int                                 null comment '0 普通用户 ｜ 1 管理员',
    registration_time timestamp default CURRENT_TIMESTAMP null comment '注册时间'
);

