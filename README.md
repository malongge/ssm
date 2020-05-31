## 手动搭建 ssm 框架

数据准备:
    
    create database testdb;

运行： `schame.sql & data.sql`

生成 mybatis 映射文件：

    mvn mybatis-generator:generate

mvn 打包:

    mvn clean install
    mvn jetty:run

查看运行结果：

    http://127.0.0.1:8080/ssm/hello/zhangsan
    http://127.0.0.1:8080/ssm/demo/hello/1