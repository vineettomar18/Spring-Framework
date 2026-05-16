# Spring XML Configuration

This project demonstrates Spring Framework XML-based configuration.

## Technologies Used

- Java
- Spring Framework
- Maven
- IntelliJ IDEA

---

## Project Structure

```text
src
 └── main
      ├── java
      │    └── com.example
      │          ├── Student.java
      │          └── Main.java
      │
      └── resources
           └── spring.xml
```

---

## spring.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="student" class="com.example.Student"/>

</beans>
```

---

## Student.java

```java
package com.example;

public class Student {

    public void display() {
        System.out.println("Spring XML Configuration");
    }
}
```

---

## Main.java

```java
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Student s = (Student) context.getBean("student");

        s.display();
    }
}
```

---

## Output

```text
Spring XML Configuration
```

---

## Concepts Learned

- IOC Container
- Bean Creation
- XML Configuration
- ApplicationContext
- Dependency Injection Basics
