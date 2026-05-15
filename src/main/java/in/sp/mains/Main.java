package in.sp.mains;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Student student = (Student) context.getBean("stdId");
     student.display();
   }



}

//spring-beans
//2-spring-core
//3-spring-context
//4-common-logging
//5-spring-expression