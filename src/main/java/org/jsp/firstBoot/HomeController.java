package org.jsp.firstBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hello world");
		return "hii";
	}

//	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from home controller";
	}

	@RequestMapping("/save")
	public User saveUser(@RequestBody User user) {
		
		return user;
	}
	@RequestMapping("/findall")
	public String findUser() {
		
		return "user found successfully";
	}
	@RequestMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		System.out.println(username);
		System.out.println(password);
		return "login";
	}
	@RequestMapping("/find")
	public Person findPerson(@RequestBody Person p) {
		
		return p;
	}
}
