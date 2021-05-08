package boot.task.jspweb.crud.sankar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(name = "roll_number")
	private long rollNo;
	@Column(name = "student_name")
    private String studentName;
	@Column(name = "dept")
    private String dept;
	@Column(name = "place")
    private String studentPlace;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStudentPlace() {
		return studentPlace;
	}
	public void setStudentPlace(String studentPlace) {
		this.studentPlace = studentPlace;
	}
    

}
