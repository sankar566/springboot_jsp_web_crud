package boot.task.jspweb.crud.sankar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boot.task.jspweb.crud.sankar.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
