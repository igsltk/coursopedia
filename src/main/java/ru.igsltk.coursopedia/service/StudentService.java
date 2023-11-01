package ru.igsltk.coursopedia.service;

import ru.igsltk.coursopedia.entity.Student;
import ru.igsltk.coursopedia.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public Student findById(Long id) {
		return studentRepository.getReferenceById(id);
	}

}