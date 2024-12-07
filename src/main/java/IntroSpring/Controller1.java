package IntroSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	
	
	@GetMapping(path = "/")
	public ModelAndView demo()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("p1");
		return m;
	}
	
	
	@GetMapping(path = "/d2")
	@ResponseBody
	public String d2()
	{
		return "This is Alex paul";
	}

}
