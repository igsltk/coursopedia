package ru.igsltk.coursopedia.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;

	@JsonIgnoreProperties("courses")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",
		joinColumns = { @JoinColumn(name = "courseid") }, 
        inverseJoinColumns = { @JoinColumn(name = "studentid") }
	)
	private List<Student> students;

}