package liz.project.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/status")
	@SuppressWarnings("static-method")
	public String status() {

		return "Hello World";
	}

}
