package boot.task.jspweb.crud.sankar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import boot.task.jspweb.crud.sankar.model.Student;
import boot.task.jspweb.crud.sankar.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentRepository.save(student);
	}
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.findById(student.getId());
	studentRepository.saveAndFlush(student);
	}
	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Optional < Student > optional = studentRepository.findById(id);
        Student student = null;
        if (optional.isPresent()) {
            student= optional.get();
        } else {
            throw new RuntimeException(" Student not found for id :: " + id);
        }
        return student;
	}
	@Override
	public void deleteStudentById(long id) {
		// TODO Auto-generated method stub
		 this.studentRepository.deleteById(id);
	}
	

}
