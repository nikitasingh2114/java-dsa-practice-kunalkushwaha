//Subtract the Product and Sum of Digits of an Integer

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q36_ProductMinusSumOfDigits {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int product = 1;

        while(num != 0)
        {
            int r = num%10;
            sum+= r;
            product*= r;
            num = num/10;
        }

        int result = product-sum;
        System.out.println("Result : "+result);

    }
}