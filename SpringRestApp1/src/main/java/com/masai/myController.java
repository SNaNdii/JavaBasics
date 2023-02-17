package com.masai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

	@RequestMapping("/StudentData")
	public Student getStudentHandler() {
		Student s1 = new Student(1, "Nandita", 345);
		return s1;
	}
}
