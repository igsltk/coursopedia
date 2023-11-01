package ru.igsltk.coursopedia.service;

import ru.igsltk.coursopedia.entity.Course;
import ru.igsltk.coursopedia.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CourseService {

	@Autowired
	private CourseRepository сourseRepository;

	public List<Course> findAll() {
		return сourseRepository.findAll();
	}

	public Course save(Course course) {
		return сourseRepository.save(course);
	}

	public Course findById(Long id) {
		return сourseRepository.getReferenceById(id);
	}

}