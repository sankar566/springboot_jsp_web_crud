package boot.task.jspweb.crud.sankar.service;

import java.util.List;


import boot.task.jspweb.crud.sankar.model.Student;



public interface StudentService {

	List <Student> getAllStudents();

	void saveStudent(Student student);
	void updateStudent(Student student);

	Student getStudentById(long id);

	void deleteStudentById(long id);
	
}
