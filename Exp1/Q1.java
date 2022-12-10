import java.util.Scanner;

public class Q1 {

    public void Factorial(int num) {
        int i ;
        double fact = 1;
        for(i=num; i>=1; i--){
            fact = fact * i;
        }
        System.out.println("the factorial of " + num + " is : " + fact);
    }

    public void testArmstrong(int num) {
        double sum = 0;
        int len = 0;
        int temp = num;
        int dig = 0;
        while(temp!=0){
            temp = temp/10;
            len = len + 1;
        }
        temp = num ;
        while(temp>0){
            dig = temp % 10 ;
            sum = sum + Math.pow(dig, len);
            temp = temp / 10 ;
        }

        if(sum==num){
            System.out.println(num + " is an armstrong number ");
        }
        else{
            System.out.println(num + " is not an armstrong number ");
        }
        
    }

    public void testPalindrome(int num) {
        int rev = 0;
        int temp = num;
        int dig = 0;
        while(temp>0){
            dig = temp % 10 ;
            rev = rev + dig ;
            rev = rev * 10 ;
            temp = temp / 10 ;
        }
        rev = rev / 10 ;
        System.out.println("the number is " + num + " the rev num is " + rev);
        if(rev==num){
            System.out.println(num + " is a palindrome number ");
        }
        else{
            System.out.println(num + " is not a palindrome number ");
        }
    }

    public static void main(String[] args) {
        
        Q1 iop = new Q1();
        
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter a number");
        int num = myobj.nextInt();
        System.out.println("entered number is : " + num);
        System.out.println("1.Factorial \n2.Armstrong  \n3. Palindrome");
        int choice = myobj.nextInt();
    
        switch (choice) {
            case 1:
            iop.Factorial(num);
                break;
                case 2:
            iop.testArmstrong(num);
                break;
                case 3:
            iop.testPalindrome(num);
                break;
        }
        myobj.close();
    
        
    }

    
}