Step to fire this APP:
1. set up a test schema in your mysql local port: 3306, with a username=admin, password=password.
2. import this APP as a maven project.
3. mvn clean install -DSkipTests to compact a war file.
4. run the application with Tomcat. If you are using eclipse or STS, just simply clicking on run on server.
5. insert the mockdata into database. I use MySQL workbench to do so.
6. play around with it to find some bugs.
7. talk with me about it at anytime, in case you want.
；）

Functions this little APP support:
Select price according to country, weight for shipping your goods.

Tech used as in description.


怎么启动：
1. 数据库配置： 端口号：3306， 用户名：admin，密码：password.
2. 牵引到开发环境里，如果使用STS或者eclipse，选择导入maven 项目.
3. 使用mvn clean install -DSkipTests来生成类及生成war包。
4. 使用tomcat来跑一下。例如，在eclipse里，run on server就可以啦。
5. 配置好数据库，并注入一些假数据，在资源里可以找到对应的sql语句。
6. 好啦，你可以抓bug了。
7. 如有疑问，请与我联系。

什么功能：
根据国家和重量，选择相应的价钱。

技术栈：
如题。
