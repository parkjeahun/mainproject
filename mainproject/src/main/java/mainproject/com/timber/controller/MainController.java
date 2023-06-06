package mainproject.com.timber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("index")
	public String indexApi() {
		System.out.println("µé¾î¿È:index");
		return "webapp/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("main")
	public String mainApi() {
		System.out.println("µé¾î¿È:main");
		return "redirect:/main";
	}
	
}
