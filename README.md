# spring boot 2.x quartz example 例子
````
# 启动前创建数据库
CREATE DATABASE IF NOT EXISTS quartz DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
grant all privileges on product_dev.* to quartz@localhost identified by 'quartz';

# 建表语句,也可以自行去官网查找
classpath:org/quartz/impl/jdbcjobstore/tables_@@platform@@.sql
or
src/main/resources/sql/tables_mysql_innodb.sql
````
## 单元测试内,修改执行时间后测试




