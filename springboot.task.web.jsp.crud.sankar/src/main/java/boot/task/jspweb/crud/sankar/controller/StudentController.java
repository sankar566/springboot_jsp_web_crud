package boot.task.jspweb.crud.sankar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import boot.task.jspweb.crud.sankar.model.Student;
import boot.task.jspweb.crud.sankar.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;

//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";
//	}
//	@RequestMapping("/new")
//	public String home1() {
//		return "new_student.jsp";
//	}
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String viewHomePage(Model model) {
        model.addAttribute("listStudents", studentService.getAllStudents());
        return "index";
    }
	@GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        // create model attribute to bind form data
       Student student = new Student();
        model.addAttribute("student", student);
        return "new_student";
    }
	 @PostMapping("/saveStudent")
	    public String saveEmployee(@ModelAttribute("student") Student student2) {
	        // save employee to database
		 System.out.println("saved id="+student2.getId());
	        studentService.saveStudent(student2);
	        return "redirect:/";
	    }
	   
//	 @GetMapping("/showFormForUpdate/{id}")
//	  public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
//
//        // get employee from the service
//	        Student student = studentService.getStudentById(id);
//
//	        // set employee as a model attribute to pre-populate the form
//	        model.addAttribute("student", student);
//	        return "update_student.jsp";
//	    }
//	   @RequestMapping("/showFormForUpdate/{id}")
//		public String home1(@PathVariable(value = "id") long id,Model model) {
//		   System.out.println("hai" +id);
//		   Student student = studentService.getStudentById(id);
//		   System.out.println("student ID" +student.getId());
//           System.out.println("student Name" +student.getStudentName());
//		   System.out.println("student dept" +student.getDept());
//		   model.addAttribute("student", student);
//		   return "redirect:/update_student.jsp";
//		}
	   @RequestMapping("/updatestudent/{id}")
		public ModelAndView home11(@PathVariable long id,Student student) {
	    ModelAndView mv = new ModelAndView();
		 student = studentService.getStudentById(id); 
		 mv.addObject("student", student); 
		mv.setViewName("update_student");
		return mv;
	}
	   @RequestMapping(value="/updatedetails",method = RequestMethod.POST)    
		
	    public String updateEmployee(Model model,Student student) {
	        // save employee to database
		   //student.id= model.getAttribute("id");
		   System.out.println("update method executed ");
		   //System.out.println(;
		   student=(Student)model.getAttribute("student");
		   System.out.println("id="+student.getId());
		   System.out.println("name="+student.getStudentName());
	        studentService.updateStudent(student);
	        return "redirect:/";
	    }
	   
	  		
	    @GetMapping("/deleteStudent/{id}")
	    public String deleteStudent(@PathVariable(value = "id") long id) {

	        // call delete employee method 
	        this.studentService.deleteStudentById(id);
	        return "redirect:/";
	    }
	
}
