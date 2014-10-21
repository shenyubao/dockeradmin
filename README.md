DockerAdmin
=======

说明
-------
通用的测试环境管理系统,集成 Docker 日常管理.

二次开发自[ZDoker](http://git.oschina.net/love320/Zdocker).作者似乎已不再更新,感谢作者.

安装步骤
-------
A.添加对外远程接口，使得 Docker API 在 tcp 上可用： <br/>
编辑 ：/etc/default/docker <br/>
追加 ：DOCKER_OPTS="-H 127.0.0.1:4243" <br/>

B.重起 docker <br/>
sudo service docker restart <br/>

C.编辑配置文件  <br/>
\src\main\java\app\utils\AppPath.java <br/>
修改：dockerPath = "http://192.168.0.134:4243";//变更为你服务器docker地址

D.使用tomcat部署启动 <br/>
请求:http://<你的tomcatIP:端口>/项目名/packages/list <br/>
