package Exp3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        System.out.println("enter no of patterns to print :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = 1;
        int i;
        int j;
        System.out.println("patterns is  :");

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

}
