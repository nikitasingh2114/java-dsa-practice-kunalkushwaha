//Reverse A String In Java

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q56_ReverseString {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter the string");
        String str = br.readLine();

        int length = str.length();

        for(int i=length-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            sb.append(ch);
        }

        System.out.println("Reversed String : "+sb);
    }
}