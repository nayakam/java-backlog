##### AOP

* [Aspectj](https://eclipse.org/aspectj/)
* [Spring AOP](https://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html)
* [JBoss AOP](http://jbossaop.jboss.org/)

##### Intellij Config to HelloAspectj

MainClass
com.aop.example.HelloAspectj

VM Options:
-javaagent:"C:\.m2\org\aspectj\aspectjweaver\1.5.4\aspectjweaver-1.5.4.jar"

Before launch: Maven Goal
clean install


##### Intellij Config to FooClassLeveLog or FooMethodLeveLog

MainClass
com.aop.example.jcabi.FooMethodLeveLog
com.aop.example.jcabi.FooMethodLeveLog

Before launch: Maven Goal
clean install

##### Maven Command

mvn jcabi:ajc
mvn jcabi:versionalize


###### Reference

* http://stackoverflow.com/questions/4819814/aop-fundamentals
* http://stackoverflow.com/questions/4829088/java-aspect-oriented-programming-with-annotations
* http://stackoverflow.com/questions/23700540/cross-cutting-concern-example
* http://www.yegor256.com/2014/06/01/aop-aspectj-java-method-logging.html
* https://github.com/leika/AspectJSimpleTest
* http://www.andrewewhite.net/wordpress/2010/03/17/aspectj-annotation-tutorial/
* https://www.javatpoint.com/spring-aop-tutorial
* https://eclipse.org/aspectj/doc/next/progguide/
