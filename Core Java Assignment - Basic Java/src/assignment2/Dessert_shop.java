package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dessert_shop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String role , orderedItem , addItem;
        int quantity;
        double CandyCost = 0.0 , CookieCost = 0.0 , IceCreamCost = 0.0;

        System.out.println("What is your role -- Owner or Customer  \n");
        role = sc.next();

        if(role.equals("Owner")){
            List<String> newItem = new ArrayList<>();

            System.out.println("Items to be added to the list are: \n");
            int scan = sc.nextInt();

            for (int i=0;i<scan;i++){
                System.out.println("Add item to " + (i+1) +" position");
                addItem = sc.next();
                newItem.add(addItem);
            }
            System.out.println(newItem);
        }
        else
        {
            System.out.println("Enter your order and quantity \n");
            orderedItem = sc.next();
            quantity = sc.nextInt();


            if(orderedItem.equals("Candy"))
            {
                Candy c = new Candy();
                CandyCost = c.getCost(quantity);
                System.out.println("Total cost of candy purchased is : " + CandyCost);
            }
            else if(orderedItem.equals("Cookie"))
            {
                Cookie coo = new Cookie();
                CookieCost = coo.getCost(quantity);
                System.out.println("Total cost of cookie purchased is : " + CookieCost);
            }
            else if(orderedItem.equals("IceCream"))
            {
                IceCream ice = new IceCream();
                IceCreamCost = ice.getCost(quantity);
                System.out.println("Total cost of Ice cream purchased is:  " + IceCreamCost);
            }
        }

    }
}