//Power In Java

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q47_PowerCalculator {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Enter Power");
        int power = Integer.parseInt(br.readLine());

        double result = Math.pow(num,power);

        System.out.println("Result: "+result);

    }
}