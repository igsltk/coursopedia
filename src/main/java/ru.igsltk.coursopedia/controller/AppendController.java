package ru.igsltk.coursopedia.controller;

import ru.igsltk.coursopedia.entity.StudentCourse;
import ru.igsltk.coursopedia.service.StudentCourseService;
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
public class AppendController {

	@Autowired
	private StudentCourseService studentCourseService;

	@PostMapping("/student/course/add")
	public ResponseEntity<StudentCourse> createCourse(@RequestBody StudentCourse studentCourse) {
		StudentCourse newStudentCourse = studentCourseService.save(studentCourse);
		return new ResponseEntity<>(newStudentCourse, HttpStatus.CREATED);
	}

}