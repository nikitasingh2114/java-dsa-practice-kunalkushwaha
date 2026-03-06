//Find if a number is palindrome or not

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q57_NumberPalindrome {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int r=0,sum=0;
        int num_dup = num;

        while(num!=0)
        {
            r = num%10;
            sum = sum*10+r;
            num = num/10;
        }

        if(sum == num_dup)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

    }
}