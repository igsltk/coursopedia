package ru.igsltk.coursopedia.controller;

import ru.igsltk.coursopedia.entity.Student;
import ru.igsltk.coursopedia.service.StudentService;
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
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	List<Student> findAllStudents() {
		return studentService.findAll();
	}

	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getTutorialById(@PathVariable("id") long id) {
		Student student = studentService.findById(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@PostMapping("/students/add")
	public ResponseEntity<Student> createCourse(@RequestBody Student student) {
		Student newStudent = studentService.save(student);
		return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
	}

}