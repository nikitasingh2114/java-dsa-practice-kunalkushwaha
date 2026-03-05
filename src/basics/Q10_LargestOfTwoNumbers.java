//Take 2 numbers as input and print the largest number.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10_LargestOfTwoNumbers {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        if(num1>num2)
            System.out.println("Num1 is greater : "+num1);

        else if(num1<num2)
            System.out.println("Num2 is greater : "+num2);

        else
            System.out.println("Both are Equal. ");

    }
}