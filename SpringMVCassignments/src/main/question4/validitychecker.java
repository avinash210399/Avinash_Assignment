package webmvcQ3;

public class validitychecker {
	public static boolean checking(String name , String email ,String password ) {
		  User user = new User();
				return name.equals(user.uname) && email.equals(user.email) && password.equals(user.password);	

}
}
