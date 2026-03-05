//Input a number and print all the factors of that number (use loops).

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q37_FactorsOfNumber {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
                sb.append(i).append(" ");
        }

        System.out.print(sb);

    }
}