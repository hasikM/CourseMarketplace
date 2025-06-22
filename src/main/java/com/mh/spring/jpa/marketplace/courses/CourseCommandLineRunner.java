package com.mh.spring.jpa.marketplace.courses;

import com.mh.spring.jpa.marketplace.courses.data.Course;
import com.mh.spring.jpa.marketplace.courses.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    CoursesJDBCRepository coursesRepository;

    @Autowired
    CourseJPARepository coursesRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1, "Java course", "MH", 1000);
        coursesRepository.insertCourse(course);
        System.out.println(coursesRepository.getAllCourses(1));
    }


}
