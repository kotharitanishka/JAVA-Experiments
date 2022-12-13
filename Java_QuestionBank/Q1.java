//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for u


package Java_QuestionBank;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of units you want to purchase : ");
        int n = sc.nextInt();
        int cost = 100;
        double total = cost * n;
        if(total>1000){
            total = 0.9*total;
        }
        System.out.println("the final cost is : " + total);
        sc.close();
    }
    
}
