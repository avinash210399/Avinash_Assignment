package question2;
import org.springframework.stereotype.Component;

@Component
public class validation{
	String user;
	String pass;
	public validation() {
		
	}
	public validation(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "validationImpl [user=" + user + ", pass=" + pass + "]";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
