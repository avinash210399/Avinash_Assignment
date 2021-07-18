package assignment1;

import java.util.Scanner;

public class Tax {

	 public static void main(String[] args) {

	        double sal,tax;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter your CTC : ");
	        sal = sc.nextInt();

	        if(sal<=180000){
	            System.out.println("On annual CTC :" + sal + " no tax is payable");
	        }

	        else if(sal>=181001 && sal<=300000){
	            tax = (sal - 180000) * 0.1;
	            System.out.println("On annual CTC " + sal + " payable tax is "+ tax);
	        }

	        else if(sal>=300001 && sal<=500000){
	            tax = (sal - 300000) * 0.2 + 12000;
	            System.out.println("On annual CTC " + sal + " payable tax is "+ tax);
	        }

	        else if(sal>=500001 && sal<=1000000){
	            tax = (sal - 500000) * 0.3 + (0.2*200000) + (0.1*120000);
	            System.out.println("On annual CTC " + sal + " payable tax is "+ tax);
	        }
	        sc.close();
	    }
}
