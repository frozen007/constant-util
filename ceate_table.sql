CREATE TABLE `constant_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `constant_name` varchar(128) NOT NULL COMMENT '常量名称',
  `constant_code` varchar(128) NOT NULL COMMENT '常量代码',
  `constant_value` smallint(4) NOT NULL COMMENT '常量数值',
  `constant_desc` varchar(128) NOT NULL COMMENT '常量描述',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `create_by` varchar(64) NOT NULL DEFAULT '' COMMENT '创建者',
  `last_modify_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '最后修改时间',
  `last_modify_by` varchar(64) NOT NULL DEFAULT '' COMMENT '最后修改者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_constant_name_code` (`constant_name`,`constant_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='常量配置';


CREATE TABLE `user_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_name` varchar(128) NOT NULL COMMENT '用户名',
  `phone_type` smallint(4) NOT NULL COMMENT '手机类型',
  `access_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户日志(测试表)';
