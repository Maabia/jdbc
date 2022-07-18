package com.example.demo;

import com.example.demo.dao.DAO;
import com.example.demo.domain.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

    private static DAO<Course> dao;

    public DemoApplication(DAO<Course> dao) {
        this.dao = dao;

    }

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.out.println("\n Create Courses -------------------------------------\n");
        Course springVue = new Course("Spring Boot + Vue", "New Course", "https://www.danvega.dev/courses");
        dao.create(springVue);

        System.out.println("\n One Course -------------------------\n");
        Optional<Course> firstOne = dao.get(1);
        System.out.println(firstOne.get());

        springVue.setDescription("Learn to build Vue apps that talk to Spring");
        dao.update(springVue,6);

        dao.delete(4);
        
        System.out.println("\nAll Courses -------------------------------------\n");
        List<Course> courses = dao.list();
        courses.forEach(System.out::println);
    }

}
