insert into constant_config (constant_name, constant_code, constant_value, constant_desc, create_time, create_by, last_modify_time, last_modify_by)
values
('phone_type',  'IPHONE', 1, '苹果手机', now(), 'zhaomingyu', now(), 'zhaomingyu')
,('phone_type', 'XIAOMI', 2, '小米手机', now(), 'zhaomingyu', now(), 'zhaomingyu')
,('phone_type', 'HUAWEI', 3, '华为手机', now(), 'zhaomingyu', now(), 'zhaomingyu')
,('phone_type', 'VIVO',   4, 'VIVO手机', now(), 'zhaomingyu', now(), 'zhaomingyu');

insert into user_log (user_name, phone_type, access_time)
values
('zmy', 1, now())
,('sun', 2, now())
,('lrr', 4, now())
,('zyy', 3, now())
,('stg', 2, now())
,('darm', 1, now());