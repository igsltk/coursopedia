package ru.igsltk.coursopedia.controller;

import ru.igsltk.coursopedia.entity.Course;
import ru.igsltk.coursopedia.service.CourseService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	List<Course> findAllStudents() {
		return courseService.findAll();
	}

	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getTutorialById(@PathVariable("id") long id) {
		Course course = courseService.findById(id);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}

	@PostMapping("/courses/add")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		Course newCourse = courseService.save(course);
		return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
	}

}