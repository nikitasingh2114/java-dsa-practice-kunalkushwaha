//To find out whether the given String is Palindrome or not.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q13_StringPalindrome {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        System.out.println("Enter the string");
        String str = br.readLine();

        int length = str.length();

        for(int i = length - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        if(str.equals(sb.toString()))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}


/*
package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q13_StringPalindrome {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string");
        String str = br.readLine();

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if(isPalindrome)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}
 */