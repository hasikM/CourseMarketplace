package com.mh.spring.jpa.marketplace.courses.jpa;

import com.mh.spring.jpa.marketplace.courses.data.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository  {

    @PersistenceContext
    private EntityManager entityManager;

    public void insertCourse(Course course) {
       entityManager.merge(course);
    }

    public Course getAllCourses(long id){
        return entityManager.find(Course.class, id);
    }


}
