// Write a java program to count number of alphabets, digits, special symbols, blank
// spaces and words from the given sentence. Also count number of vowels and
// consonants

package Java_QuestionBank;

import java.util.Scanner;

public class Q11 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence : ");
        String s = sc.nextLine();
        System.out.println(s);
        int n = s.length();
        System.out.println(n);
        int aplha=0 , dig = 0 , blank = 0 ,rem = 0 , vov = 0 , con = 0 , words = 0;

        for(int i = 0 ; i< n ; i++){

            int ascii = s.charAt(i);

            if(65 <= ascii && ascii <= 90 || 97 <= ascii && ascii <= 122 ){
                aplha +=1;
            }
            else if (48 <= ascii && ascii <= 57){
                dig +=1;
            }
            else if (ascii == 32){
                blank +=1;
            }
            else rem +=1;

            if(ascii == 65 || ascii == 97 || ascii == 69 || ascii == 101 || ascii == 73 || ascii == 105 || 
            ascii == 79 || ascii == 111 || ascii == 85 || ascii == 117){
                vov +=1;
            }

            con = aplha - vov;
            words = (int) blank + 1;
        } 
        System.out.println("no of alpha is " + aplha + "\n no of digs is " + dig + " \nno of special symbols is "
        + rem +  " \nno of spaces is " + blank +  " \nno of words is " + words + "\nno of vov is " + vov + "\nno of con is " + con  );

        sc.close();

    }
    
}
