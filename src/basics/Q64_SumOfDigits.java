//Sum Of A Digits Of Number

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q64_SumOfDigits {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int r=0,sum=0;
        int num_dup = num;

        while(num!=0)
        {
            r = num%10;
            sum = sum+r;
            num = num/10;
        }

        System.out.println("Sum of the digits of the Number : "+sum);
    }
}