### 插件
mbg-plugin 分页插件项目，需要是一个独立项目(为了方便放在x-mbg下，并不是子项目)

### 测试
```sql
-- yxyd_base.yxyd_alarm definition

CREATE TABLE `yxyd_alarm` (
  `alarm_time` datetime NOT NULL COMMENT '告警发生时间',
  `obj_no` varchar(100) COLLATE utf8mb4_bin NOT NULL COMMENT '告警对象',
  `user_name` varchar(100) COLLATE utf8mb4_bin NOT NULL COMMENT '接收告警的用户',
  `alarm_date` date DEFAULT NULL COMMENT '告警发生日期',
  `org_no` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '告警对象所属供电单位编码',
  `alarm_type` int(11) DEFAULT NULL COMMENT '告警类型，1地市，2区县，3用户',
  `alarm_msg` text COLLATE utf8mb4_bin COMMENT '告警消息',
  `read_state` int(11) DEFAULT NULL COMMENT '是否已读，1已读，0未读',
  `region_no` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '地区编码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`alarm_time`,`obj_no`,`user_name`),
  KEY `yxyd_alarm_alarm_date_IDX` (`alarm_date`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='错避峰异常告警';
```

### 官网
- http://mybatis.org/generator/index.html