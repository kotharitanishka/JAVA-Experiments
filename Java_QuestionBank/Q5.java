// An Election is contested by 5 candidates. The candidate numbers are 1 to 5 and the
// voting is done by making the candidate number on the ballot paper. Write a program to
// read the ballots and count the vote for each candidate using and array variable count. In
// case, a number read is outside the range 1 to 5, the ballot should be considered as a
// ‘spoilt ballot ‘and the program should also count the number of spoiled ballots.

package Java_QuestionBank;


// Java program to create HashMap from an array
// by taking the elements as Keys and
// the frequencies as the Values

import java.util.*;

public class Q5 {

	// Function to create HashMap from array
	static void createHashMap(int arr[])
	{
		// Creates an empty HashMap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {

			// Get if the element is present
			Integer c = hmap.get(arr[i]);

			// If this is first occurrence of element
			// Insert the element
			if (hmap.get(arr[i]) == null) {
				hmap.put(arr[i], 1);
			}

			// If elements already exists in hash map
			// Increment the count of element by 1
			else {
				hmap.put(arr[i], ++c);
			}
		}

		// Print HashMap
		System.out.println(hmap);
	}

	// Driver method to test above method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter an element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("the entered elements are : " + Arrays.toString(arr));
		createHashMap(arr);

        int count = 0;

        for (int ele : arr) {
            if( ele!=1 &&  ele!=2 &&  ele!=3 &&  ele!=4 && ele!=5){
                count += 1;
            }  
        }
		
        System.out.println("no of spoilt ballot = " + count);

        sc.close();


	}
}
