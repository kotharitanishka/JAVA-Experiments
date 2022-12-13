//Implement a java program to calculate gross salary and net salary taking the following
//data.
//Input: empno, empname, basic
//Process
//DA=70% of basic
//HRA=30% of basic
//CCA= Rs. 240/-
//PF=10% of basic
//PT=Rs.100

package Java_QuestionBank;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //  System.out.println("enter the employee name :");
        //  String empname = sc.nextLine();
        System.out.println("enter the employee number :");
        int empno = sc.nextInt();
        System.out.println("enter the employee name :");
        String empname = sc.next();
        System.out.println("enter the basic salary :");
        int basic = sc.nextInt();

        float da = (float) 0.7*basic;
        float hra = (float) 0.3*basic;
        int cca = 240;
        float pf = (float) 0.1*basic;
        int pt = 100;

        float gs = (float) basic + da + hra;
        float ns = (float) gs - cca - pt - pf;

        System.out.println("the gross salary of " + empname + " (" + empno +") is : " + gs);
        System.out.println("the net salary of " + empname + " (" + empno +") is : " + ns);

        sc.close();
    }
}
