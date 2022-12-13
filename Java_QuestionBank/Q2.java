// Given five positive integers, find the minimum and maximum values that can be
// calculated by summing exactly four of the five integers. Then print the respective
// minimum and maximum values as a single line of two space-separated long integers.
// Example 1 2 3 4 5
// The minimum sum is 1+2+3+4=10 and the maximum sum is 2+3+4+5=14. The
// function prints


package Java_QuestionBank;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        
        int [] a = { 2 , 4 , 5 , 3 , 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int min = 0;
        int max = 0;

        for(int i =0 ; i< 4 ; i ++ ){
            min = min + a[i];
        }
        System.out.println("min sum is : " + min); 

        for(int j = 4 ; j> 0 ; j --){
            max = max + a[j];
        }
        System.out.println("max sum is : " + max);
    }
    
}
