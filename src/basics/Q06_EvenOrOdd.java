//Write a program to print whether a number is even or odd, also take input from the user.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06_EvenOrOdd {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}

