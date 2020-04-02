package springmvctags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@RequestMapping("/showFormmvc")
	public String showFormmvc(Model theModel) {
		 		theModel.addAttribute("student", new Student());
		
		
		return "mvcformtagsstudent-form";
	}
	@RequestMapping("/processFormmvc")
	public String processFormMvc(@ModelAttribute("student") Student theStudent) {
		
		
		System.out.println(" student name"+ theStudent.getFirstName());
		return "student-confirmation";
	}

}
