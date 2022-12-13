//Write a Java Program to calculate the Result. Result should consist of name, seatno,
//date, center number and marks of semester three exam. Create a User Defined
//Exception class MarksOutOfBoundsException, If Entered marks of any subject is
//greater than 100 or less than 0, and then program should create a user
//defined Exception of type MarksOutOfBoundsException and must have a
//provision to handle it

package Java_QuestionBank;

import java.util.*;

class CustomEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of your child : ");
        int marks = sc.nextInt();

        try {
            if (marks > 100 || marks < 0) {
                sc.close();
                UserException e = new UserException();
                throw e;
            } else {
                System.out.println("Good human");
            }
        } catch (UserException e) {
            System.out.println("Handled");
        }

        sc.close();

    }

}

class UserException extends Exception {
    UserException() {
        System.out.println("Marks has to be within the range 0-100 ");
    }
}
