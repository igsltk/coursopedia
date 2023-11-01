package ru.igsltk.coursopedia.service;

import ru.igsltk.coursopedia.entity.StudentCourse;
import ru.igsltk.coursopedia.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentCourseService {

	@Autowired
	private StudentCourseRepository studentCourseRepository;

	public StudentCourse save(StudentCourse studentCourse) {
		return studentCourseRepository.save(studentCourse);
	}

}