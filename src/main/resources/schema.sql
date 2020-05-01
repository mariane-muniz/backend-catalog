drop database catalog;
create database catalog collate latin1_swedish_ci;
use catalog;

create table categories
(
    id          bigint       not null
        primary key,
    code        varchar(255) not null,
    created_at  datetime     not null,
    updated_at  datetime     not null,
    active      bit          null,
    description varchar(255) not null,
    name        varchar(255) not null,
    constraint UK_dpusovwfttipdju5vdp10kcbm
        unique (description),
    constraint UK_iwylx6fb2dqdw8kfc31vaiiyp
        unique (code),
    constraint UK_t8o6pivur7nn124jehx7cygw5
        unique (name)
);

create table hibernate_sequence
(
    next_val bigint null
);

create table manufacturers
(
    id         bigint       not null
        primary key,
    code       varchar(255) not null,
    created_at datetime     not null,
    updated_at datetime     not null,
    name       varchar(255) not null,
    constraint UK_57cv2b7a7nba91s6ll73x10eu
        unique (code),
    constraint UK_rgruuf4bdtokowdxk169bs8op
        unique (name)
);

create table products
(
    id             bigint       not null
        primary key,
    code           varchar(255) not null,
    created_at     datetime     not null,
    updated_at     datetime     not null,
    date_available datetime     null,
    description    longtext     null,
    ean            varchar(255) null,
    model          varchar(255) null,
    name           varchar(255) not null,
    sku            varchar(255) null,
    status         bit          not null,
    upc            varchar(255) null,
    constraint UK_57ivhy5aj3qfmdvl6vxdfjs4p
        unique (code),
    constraint UK_o61fmio5yukmmiqgnxf8pnavn
        unique (name)
);

create table digital_products
(
    id bigint not null
        primary key,
    constraint FKf77bihq8k32dnxjtv6p127ljn
        foreign key (id) references products (id)
);

create table physical_products
(
    height double not null,
    length double not null,
    weight double not null,
    width  double not null,
    id     bigint not null
        primary key,
    constraint FKl4fcq7lor2t0c9r2fktkr6l7m
        foreign key (id) references products (id)
);

create table prod_cat_rel
(
    product_id  bigint not null,
    category_id bigint not null,
    primary key (product_id, category_id),
    constraint FK3okoml642syn5wvrp8yadr7ra
        foreign key (category_id) references categories (id),
    constraint FKaegmc7d9xmujge6u3b24i5vtc
        foreign key (product_id) references products (id)
);

create table reviews
(
    id         bigint       not null
        primary key,
    code       varchar(255) not null,
    created_at datetime     not null,
    updated_at datetime     not null,
    author     varchar(255) not null,
    date       datetime     not null,
    product    tinyblob     not null,
    rating     int          not null,
    status     bit          not null,
    constraint UK_49rit4v2mogq99tuhxouwel4f
        unique (code)
);

create table services
(
    id bigint not null
        primary key,
    constraint FKd03g7afddr2985p2t8ygo2arr
        foreign key (id) references products (id)
);

