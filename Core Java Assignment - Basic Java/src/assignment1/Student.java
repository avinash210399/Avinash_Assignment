package assignment1;

import java.util.Scanner;

public class Student {
        String name;
        float total, percentage;
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);

        Student() {
            System.out.println("Enter name: ");
            name = sc.next();
            getMarks();
        }

        public void getMarks() {
            System.out.println("Enter marks out of 100: ");
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
                total += marks[i];
            }
            percentage = total / 3;
            System.out.println("Sum " + total);
            System.out.println("Percentage " + percentage);
        }

}