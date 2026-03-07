//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q66_SumOfNegativeEvenOddNumbers {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sumOfNegativeNumbers = 0;
        int sumOfPositiveEvenNumbers = 0;
        int sumOfPositiveOddNumbers = 0;

        while(true)
        {
            int num = Integer.parseInt(br.readLine());

            if(num == 0)
                break;

            else if(num<0)
                sumOfNegativeNumbers += num;

            else
            {
                if(num%2 == 0)
                    sumOfPositiveEvenNumbers += num;
                else
                    sumOfPositiveOddNumbers += num;
            }
        }

        System.out.println("the sum of negative numbers : " + sumOfNegativeNumbers);
        System.out.println("sum of positive even numbers : "+sumOfPositiveEvenNumbers);
        System.out.println("the sum of positive odd numbers : "+ sumOfPositiveOddNumbers);

    }
}