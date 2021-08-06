package com.duttech.Human_Assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HumanController {
	@RequestMapping("/")
	public String greeting(@RequestParam(value = "q", required = false) String searchQuery, @RequestParam(value = "q1", required = false) String searchQuery1 ) {
		if (searchQuery == null) {
			return " <h1> Hello Human </h1><br/><p>Welcome to SpringBoot!</p>";
		}
		else if (searchQuery1 == null) {
			return "<h1>Hello" + searchQuery+ "" + "</h1><br/><p>Welcome to SpringBoot! <a href = '/'>Go Back</a>";
		}
//		return "Hello " + searchQuery + " " + searchQuery1;
		return "<h1>Hello" + searchQuery+ "" + searchQuery1+ "</h1><br/><p>Welcome to SpringBoot! <a href = '/'>Go Back</a>";
	}

}
