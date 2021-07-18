package assignment1;

import java.util.Scanner;

public class Results {

	 public static void main(String[] args) {

	        int m1 , m2, m3;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter marks for subject 1 ");
	        m1 = sc.nextInt();
	        System.out.println("Enter marks for subject 2 ");
	        m2 = sc.nextInt();
	        System.out.println("Enter marks for subject 3 ");
	        m3 = sc.nextInt();

	        if(m1>60 && m2>60 && m3>60 ){
	            System.out.println("Passed");
	        }
	        else if((m1>60 && m2>60) || (m1>60 && m3>60) || (m2>60 && m3>60)){
	            System.out.println("Promoted");
	        }
	        else{
	            System.out.println("Failed");
	        }
	        sc.close();
	    }
}
