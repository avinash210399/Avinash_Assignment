package question2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userauthentication {
	
	validation v=new validation() ;
	
	@RequestMapping("/user")
	 String getvalidation(@RequestParam("name") String n,@RequestParam("password") String p) {
		v.setUser("avinash");
		v.setPass("avinash");
		
		if(v.getUser().equalsIgnoreCase(n) && v.getPass().equalsIgnoreCase(p) )	
		return "valid user";
		else 
		return"invalid user";
		
	}

}
