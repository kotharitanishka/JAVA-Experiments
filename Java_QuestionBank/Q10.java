// WAP to find whether the entered 4 digit number is vampire or not. Combination of
// digits from this number forms 2-digit number. When they are multiplied by each other
// we get the original number. (1260=21*60, 1395=15*93, 1530=30*51)

package Java_QuestionBank;

import java.util.Scanner;
import java.util.*;
import java.util.Vector;

class Vampire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> nums = new Vector<>();
        Integer[] indices = { 0, 1, 2, 3 };
        System.err.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = num;
        Boolean isVam = false;

        while (num > 0) {
            nums.add(num % 10);
            num = num / 10;
        }

        outerloop: for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i != j) {
                    int a = nums.get(i) * 10 + nums.get(j);
                    Set<Integer> set = new HashSet<Integer>(nums);
                    set.remove(nums.get(i));
                    set.remove(nums.get(j));
                    List<Integer> arr = new ArrayList<>(set);

                    int b = arr.get(0) * 10 + arr.get(1);
                    int c = arr.get(1) * 10 + arr.get(0);
                    if (a * b == sum || a * c == sum) {
                        System.err.println("Vampire Number xD");
                        isVam = true;
                        break outerloop;
                    }
                }
            }
        }

        if (!isVam) {
            System.err.println("Not a Vampire Number :) ");
        }

        sc.close();
    }

}
