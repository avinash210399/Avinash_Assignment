package webmvcQ3;

public class validitychecker {
	public validitychecker() {
		
	}
	
	public static boolean checking(String name , String email ,String password ) {
		 return (name.equalsIgnoreCase("avinash") && email.equalsIgnoreCase("avinash@gamil.com") &&  password.equalsIgnoreCase("capg@123"));

}
}
