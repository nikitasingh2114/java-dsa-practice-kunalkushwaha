//Armstrong Number In Java

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q54_ArmstrongNumber {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int r=0,sum=0;
        int num_dup = num;

        while(num!=0)
        {
            r = num%10;
            sum = sum+r*r*r;
            num = num/10;
        }

        if(sum == num_dup)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

    }
}