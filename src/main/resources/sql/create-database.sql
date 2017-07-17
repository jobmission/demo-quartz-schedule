CREATE DATABASE IF NOT EXISTS quartz DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

grant all privileges on quartz.* to quartz@localhost identified by 'quartz';