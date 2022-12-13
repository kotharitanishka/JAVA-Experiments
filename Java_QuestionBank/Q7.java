// Caesar cipher is one of the simplest encryption technique. 
// By using this cipher technique we can replace each letter in the 
// plaintext with different one a fixed number of places up or down the alphabet.
// For example : With right shift of 3: plaintext : ABCDEFGHIJKLMNOPQRSTUVWXYZ
// ciphertext : DEFGHIJKLMNOPQRSTUVWXYZABC

package Java_QuestionBank;

import java.util.*;

class Caesar {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PT to encrypt : ");
        String pt = sc.nextLine();

        System.out.print("Enter key : ");
        int key = sc.nextInt();

        System.out.println("Encrypted CT : " + encrypt(pt,key));
    }

    static String encrypt(String pt,int key){
        String ct = "";

        for (int ii=0; ii<pt.length();ii++){

            int xc = alpha.indexOf(pt.charAt(ii));
            xc = (xc + key) % 26;
            ct += alpha.charAt(xc);

        }

        return ct;
    }

}