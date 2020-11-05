## 说明
学习网站：http://gitbook.net/testng/20130914294.html <br/>
官网：https://testng.org/doc/index.html
IDEA testNG配置：https://www.cnblogs.com/54tester/p/11518263.html

1. 工程结构
+ src/main/java/org.example 存放的业务代码
+ src/test/java/org.example.cases 存放测试用例
+ src/test/resources/ 存放测试用例xml文件
2. 打包命令，进入根工程目录
```shell script
mvn clean package
```
3. 运行测试用例
+ 可以把鼠标放到测试类右击run就可以执行
+ 用mvn运行：
```shell script
 mvn test
```
+ 右击testng.xml 直接run，会生成测试报告
+ 如果用mvn clean package 打包jar后执行
```java

```
