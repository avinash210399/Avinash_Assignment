package question5;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

public class Vsitedplaces implements Places{


	@Primary
	public void visited() {
		System.out.println("hiii");
		
	}
	

}
