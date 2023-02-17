package com.masai;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

	@RequestMapping("/data")
	public List<Student> studentData() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Nandita Singh", 335));
		list.add(new Student(2, "Pankaj Singh", 385));
		list.add(new Student(3, "Vivek Singh", 327));
		list.add(new Student(4, "Ankita Singh", 368));
		list.add(new Student(5, "Shilpi Singh", 321));
		
		return list;
	}
}
