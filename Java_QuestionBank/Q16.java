//Write a Java Program to input the data through command Line and 
//Find out total valid and in-valid integers. (Hint: use exception handling)

package Java_QuestionBank;

import java.util.*;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter anything");
        String[] s = sc.nextLine().split("");
        System.out.println("entered input is : " + Arrays.toString(s));

        int valid_int = 0, invalid_int = 0;

        for (String num : s) {
            try {
                Integer.parseInt(num);
                valid_int = valid_int + 1;
            } catch (NumberFormatException e) {
                invalid_int = invalid_int + 1;
            }
        }

        System.out.println("no of valid integers : " + valid_int);
        System.out.println("no of invalid integers : " + invalid_int);

        sc.close();

    }

}
