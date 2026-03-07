//Perfect Number In Java

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q62_PerfectNumber {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int sum=0;

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
                sum+= i;
        }
        if(sum == num)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");


    }
}