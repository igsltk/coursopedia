# Coursopedia - Online courses service

## Description
Simple RESTful API service with online courses.

## I USED
* Spring Boot
* Lombok
* Hibernate
* PostgreSQL
* Docker
* docker-compose
* Python for tests

## API
It shows all courses.
```
GET
/api/v1/courses
```
It shows all students.
```
GET
/api/v1/students
```
It adds new courses.
```
POST
/api/v1/courses/add
data = {
	"name": "JavaPro",
	"description": "Java Course for professionals",
}
```
It adds new students.
```
POST
/api/v1/students/add
data = {
	"firstname": "Max",
	"lastname": "Simons",
	"username": "max.sim",
}
```
It links student and his new course.
```
POST
/api/v1/student/course/add
data = {
	"studentid": 1,
	"courseid": 1,
	
}
```