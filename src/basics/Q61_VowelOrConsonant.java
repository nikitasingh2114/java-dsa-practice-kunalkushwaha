//Java Program Vowel Or Consonant

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q61_VowelOrConsonant {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the character");
        char ch = br.readLine().charAt(0);

        if(ch == 'a'||ch=='A'||ch == 'e'||ch=='E'|| ch == 'i'||ch=='I'||ch == 'o'||ch=='O'||ch == 'u'||ch=='U')
            System.out.println("The entered character is a VOWEL");
        else
            System.out.println("The entered character is a CONSONANT");


    }
}