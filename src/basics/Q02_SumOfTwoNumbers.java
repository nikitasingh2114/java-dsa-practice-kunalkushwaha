//Take two numbers and print the sum of both.

package basics;

import java.io.*;

public class Q02_SumOfTwoNumbers {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
