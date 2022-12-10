import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int low;
        int high;
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter 3 numbers : ");
        int x = myobj.nextInt();
        int y = myobj.nextInt();
        int z = myobj.nextInt();
        System.out.println("the entered numbers are : x : " + x + " y : " + y + " z : " + z);

        high = z > (x > y ? x : y) ? z : ((x > y) ? x : y);
        System.out.println("highest number is : " + high); 
        
        low = z < (x < y ? x : y) ? z : ((x < y) ? x : y);
        System.out.println("lowest number is : " + low); 
        myobj.close();
    }
}
