## 常用依赖
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.15.RELEASE</version>
</dependency>

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>3.8.2</version>
    <scope>test</scope>
</dependency>
```

## xml模版
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/context/spring-aop.xsd">

    <context:annotation-config/>
</beans>
```


## 注解说明
- @Autowired  : 自动装配通过类型，名字  
  如果都找不到可以使用@Qualifier(value="cat111")直接指定id
- @Resource   : 自动装配通过类型，名字  
  如果都找不到则使用@Resource(value="cat111"")指定id。
- @Component  : 组件，放在类上，说明该组件被Spring管理了，同时有以下三个等价的衍生注解  
  - dao         :@Repository
  - service     :@Service
  - controller  :@Controller  

  这三个注解功能是完全一样的，都代表将某个类注册到spring中，装配Bean

