package com.mh.spring.jpa.marketplace.courses.jdbc;

import com.mh.spring.jpa.marketplace.courses.data.Course;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoursesJDBCRepository {

    private static final String INSERT_TO_COURSE = "INSERT INTO course (id, name, author, price) values (?,?,?,?)";

    private static final String SELECT_ALL_COURSE = "Select * from course";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertCourse(Course course) {
        jdbcTemplate.update(INSERT_TO_COURSE, course.getId(), course.getName(), course.getAuthor(), course.getPrice());
    }

    public List<Course> getAllCourses(){
        return jdbcTemplate.query(SELECT_ALL_COURSE, new BeanPropertyRowMapper<>(Course.class));
    }


}
