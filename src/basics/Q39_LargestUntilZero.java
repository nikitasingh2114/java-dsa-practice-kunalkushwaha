//Take integer inputs till the user enters 0 and print the largest number from all.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q39_LargestUntilZero {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max=0;

        while(true)
        {
            int num = Integer.parseInt(br.readLine());
            if(num==0)
                break;
            else
                if(max<num)
                    max=num;
        }

        System.out.println(max);

    }
}