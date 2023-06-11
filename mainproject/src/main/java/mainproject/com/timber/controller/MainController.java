package mainproject.com.timber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/index")
	public String indexApi() {
		//ModelAndView mav = new ModelAndView("default/index");
		System.out.println("µé¾î¿È:index");
		return "defualt/index";
	}
	
	@RequestMapping("main")
	public String mainApi() {
		System.out.println("µé¾î¿È:main");
		return "redirect:/main";
	}
	
}
