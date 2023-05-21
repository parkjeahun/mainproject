package mainproject.com.timber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mainproject/*")
public class MainController {

	@GetMapping("home")
	public String mainApi() {
		System.out.println("����");
		return "index.jsp";
	}
	
}
