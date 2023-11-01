import requests
import json


"""
url = "http://localhost:8080/api/v1/courses"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))

print('\n######################################\n')

url = "http://localhost:8080/api/v1/students"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
"""







url = "http://192.168.0.42:8080/api/v1/courses/add"
data = {
    "name": "JavaPro",
    "description": "Java Course for professionals",
}
response = requests.post(url, json=data)
print("Status Code", response.status_code)
print("JSON Response ", response.json())



print('\n######################################\n')




url = "http://192.168.0.42:8080/api/v1/students/add"
data = {
    "firstname": "Max",
    "lastname": "Simons",
    "username": "max.sim",
}
response = requests.post(url, json=data)
print("Status Code", response.status_code)
print("JSON Response ", response.json())



print('\n######################################\n')




url = "http://192.168.0.42:8080/api/v1/student/course/add"
data = {
    "studentid": 1,
    "courseid": 1,
    
}
response = requests.post(url, json=data)
print("Status Code", response.status_code)
print("JSON Response ", response.json())