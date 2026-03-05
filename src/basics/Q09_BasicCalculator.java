//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09_BasicCalculator {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        char c = br.readLine().charAt(0);

        if(c == '+')
        {
            int addition = num1+num2;
            System.out.println("Addition : " + addition);
        }
        if(c == '-')
        {
            int subtraction = num1-num2;
            System.out.println("Subtraction : " + subtraction);
        }
        if(c == '*')
        {
            int multiplication = num1*num2;
            System.out.println("Multiplication : " + multiplication);
        }
        if(c == '/')
        {
            int division = num1/num2;
            System.out.println("Division : " + division);
        }
    }
}