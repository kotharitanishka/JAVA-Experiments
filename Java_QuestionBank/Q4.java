// Write a menu driven program to perform the following operations on one
// dimensional array. (accept data from user)
// a) to search a given element in an array
// b) to sort elements in descending order
// c) to delete the duplicate elements from an array

package Java_QuestionBank;

//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.*;
//import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements in the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter an element : ");
            a[i] = sc.nextInt();
        }
        System.out.println("the entered elements are : " + Arrays.toString(a));
        // for(int i=0 ; i<n ; i++){
        // System.out.print(a[i] + " ");
        // }

        System.out.println("enter the operation you want to perform : \n1.Search \n2.Sort \n3.Delete duplicate");
        int key = sc.nextInt();

        switch (key) {
            case 1:
                search(a, n);
                break;
            case 2:
                dsort(a, n);
                break;
            case 3:
                deleteduplicate(a, n);
                break;
        }
        sc.close();

    }

    static void search(int a[], int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number you want to search : ");
        int num = s.nextInt();
        // System.out.println(Arrays.binarySearch(a, num));
        // Arrays.binarySearch(a, num);
        // int flag = 0;
        int x = Arrays.binarySearch(a, num);
        System.out.println(x);
        
        // for (int i = 0; i < n; i++) {
        //     if (a[i] == num) {
        //         System.out.println("the element " + num + " is found at index " + i);
        //         flag = 1;
        //     }
        // }
        // if (flag == 0) {
        //     System.out.println("the element " + num + " is not found");
        // }
        s.close();
        
    }

    static void dsort(int a[], int n) {
        // Arrays.sort(a);
        // Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        
        System.out.println("sorted array is : " + Arrays.toString(a));
    }

    // static void deleteduplicate(int a[], int n){

    // for (int i = 0; i < n; i++) {
    // for (int j = i+1; j < n; j++) {
    // if(a[i] == a[j]) {
    // a[i] = 0;
    // }
    // }
    // }

    // }

    // Java Program to Remove Duplicate Elements
    // From the Array using extra space

    static void deleteduplicate(int a[], int n) {
        // // creating another array for only storing
        // // the unique elements
        // int[] temp = new int[n];
        // int j = 0;

        Set<Integer> x = new HashSet<>();
        for(int i : a){
            x.add(i);
        }
       
        // for (int i = 0; i < n - 1; i++) {
        //     if (a[i] != a[i + 1]) {
        //         temp[j++] = a[i];
        //     }
        // }
        

    

        // temp[j++] = a[n - 1];
        // System.err.println("the new array is : ");

        // // Changing the original array
        // for (int i = 0; i < j; i++) {
        //     a[i] = temp[i];
        //     System.out.print(a[i] + ", ");
        // }
        System.out.println("new array is : " + x) ;

    }

}
