package question3;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jsonQ3 {
	@Autowired
	addressservice addressservice;
	
	@GetMapping("/info")
	public Address predict(@RequestParam("zipcode") String p) {
		
		return addressservice.predict(p);
		
	}
	

}
