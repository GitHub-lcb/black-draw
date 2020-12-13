-- ----------------------------
-- 1、抽奖记录表
-- ----------------------------
drop table if exists draw_record;
create table draw_record
(
    id          bigint(20) not null auto_increment comment '主键id',
    prize       varchar(20) default '' comment '奖品',
    role_name   varchar(20) default '' comment '玩家名',
    status      text        default null comment '抽奖状态',
    del_flag    char(1)     default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64) default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64) default '' comment '更新者',
    update_time datetime comment '更新时间',
    primary key (id)
) engine = innodb
  auto_increment = 200 comment = '抽奖记录表';

-- 2、物品表
-- ----------------------------
drop table if exists draw_item;
create table draw_item
(
    id          bigint(20) not null auto_increment comment '主键id',
    icon        varchar(64) default '' comment '图片路径',
    name        varchar(20) default '' comment '物品名',
    num         int         default 0 comment '物品编号',
    rate        double      default null comment '中奖的概率',
    is_prize    int(1)      default null comment '是否中奖，1表示中奖',
    del_flag    char(1)     default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64) default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64) default '' comment '更新者',
    update_time datetime comment '更新时间',
    primary key (id)
) engine = innodb
  auto_increment = 200 comment = '物品表';

-- 2、积分兑换表
-- ----------------------------
drop table if exists score_record;
create table score_record
(
    id          bigint(20) not null auto_increment comment '主键id',
    goods        varchar(64) default '' comment '兑换物品',
    score_total        int default 0 comment '积分总数量',
    score_remain        int default 0 comment '积分剩余数量',
    score_cost        int default 0 comment '消耗积分',
    del_flag    char(1)     default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64) default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64) default '' comment '更新者',
    update_time datetime comment '更新时间',
    primary key (id)
) engine = innodb
  auto_increment = 200 comment = '积分兑换表';


