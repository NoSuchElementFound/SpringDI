package com.example.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringDiApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee emp= (Employee) context.getBean("employee");
        System.out.println(emp.getSalary());
        Person person= (Person) context.getBean("person");
        System.out.println(person.name);
        System.out.println(person.age);
    }

}
