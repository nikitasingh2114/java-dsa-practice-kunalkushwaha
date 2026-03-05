//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q38_SumUntilZero {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while(true)
        {
            int num = Integer.parseInt(br.readLine());
            if(num==0)
                break;
            else
                sum+=num;
        }

        System.out.println(sum);
    }
}