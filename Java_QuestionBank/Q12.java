// WAP that accepts a shopping list of items and performs the following operations: Add
// an item at a specified location, delete an item in the list, and print the contents of the
// vector


package Java_QuestionBank;

import java.util.Vector;

public class Q12 {
    public static void main(String[] args) {
        Vector<Integer> sList = new Vector<Integer>();
        sList.add(0, 1000);
        sList.add(1, 4000);
        sList.add(2, 2000);
        sList.add(3, 3000);
        sList.add(1234);
        sList.removeElement(4000);
        System.out.println(sList);
    }
    
}
