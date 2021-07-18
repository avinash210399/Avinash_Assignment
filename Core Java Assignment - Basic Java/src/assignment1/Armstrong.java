package assignment1;

import java.util.Scanner;

class Armstrong {
    public boolean armstrongCheck(int num) {
        int sum=0,arm = num;
        while(num>0) {
            int temp = num%10;
            sum+=temp*temp*temp;
            num = num/10;
        };
        if(sum == arm) {
            return true;
        }
        return false;
    }
}

 class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Armstrong check = new Armstrong();
        boolean res = check.armstrongCheck(num);
        System.out.println(res);
        scan.close();
    }
}
