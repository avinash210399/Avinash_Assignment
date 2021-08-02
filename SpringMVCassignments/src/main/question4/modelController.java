package webmvcQ3;

import java.net.Authenticator.RequestorType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class modelController {
	
	
	validitychecker ch=new validitychecker();
	
	@RequestMapping("/")
	public String loginfirst(){
		
		return "registation.jsp";
	}
	
	@RequestMapping("/reg")
	public String reg(@ModelAttribute User user1,Model model) {
		
		return "login.jsp";
	}
	
	@RequestMapping("/validate")
	public String login(@ModelAttribute User user, Model model) {
		if (ch.checking (user.uname,user.email, user.password) ) 
			return "error.jsp";
		
		else
		return "success.jsp";
	
	}
	
	

}
