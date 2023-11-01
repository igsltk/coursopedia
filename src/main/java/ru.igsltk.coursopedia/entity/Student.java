package ru.igsltk.coursopedia.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String username;
	//private String password;

	@JsonIgnoreProperties("students")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",
		joinColumns = { @JoinColumn(name = "studentid") }, 
        inverseJoinColumns = { @JoinColumn(name = "courseid") }
	)
	private List<Course> courses;

}