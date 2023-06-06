package mainproject.com.timber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@GetMapping("main")
	public String mainApi() {
		System.out.println("µé¾î¿È");
		return "main.jsp";
	}
	
}
