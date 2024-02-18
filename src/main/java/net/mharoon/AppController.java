package net.mharoon;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

	//http://localhost:8080/api/hello
	@GetMapping("/hello")
	public String sayHello() {
		return "Alive!";
	}
	@GetMapping("/list")
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Pineapple");
		return list;
	}
}
