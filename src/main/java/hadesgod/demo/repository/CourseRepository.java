package hadesgod.demo.repository;

import org.springframework.data.repository.CrudRepository;

import hadesgod.demo.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {
    
}