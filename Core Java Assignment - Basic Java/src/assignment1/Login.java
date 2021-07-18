package assignment1;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st=" ";
        System.out.println("Enter the Username");
        String user_name = sc.nextLine();
        if((user_name.contains(st)) || user_name.length()<4){
            System.out.println("Invalid Username");
            return;
        }

        System.out.println("Enter the Password");
        String user_pass = sc.nextLine();
        if((user_pass.contains(st)) || user_pass.length()<4){
            System.out.println("Invalid Password");
            return;
        }

        System.out.println(user_name+" you are Registered Successfully");


        System.out.println("Enter the Username");
        String uname = sc.nextLine();
        for (int passAttempts = 0; passAttempts < 3; passAttempts++)
        {

            System.out.println("Enter the Password");
            String upass = sc.nextLine();


            if (!(user_name.equals(uname) && user_pass.equals(upass)))
            {
                System.out.println("\nWrong Password, Try Again");
            }
            else
            {
                System.out.println("\nWelcome!");
                break;
            }
        }

        System.out.println("Login Failed, Contact Admin");
        
    }
}


