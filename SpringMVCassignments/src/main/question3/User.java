package webmvcQ3;

public class User {
	public String uname;
	public String password;
	public String email;
	public User(){
		
	}
	public User(String uname, String password, String email) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "model [uname=" + uname + ", password=" + password + ", email=" + email + "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return password;
	}
	public void setPass(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
