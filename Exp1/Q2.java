import java.util.Scanner;

public class Q2 {

    public static void table(int n) {
        int i ;
        int temp ;
        System.out.println("the first 10 multiples of " + n + " are : ");
        for(i=1 ; i<=10 ; i++){
            temp = n * i ;
            System.out.println(n + " * " + i + " = " + temp);
        }
    } 
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = myobj.nextInt();
        System.out.println("entered number is : " + n);
        table(n);
        myobj.close();
    }
}
