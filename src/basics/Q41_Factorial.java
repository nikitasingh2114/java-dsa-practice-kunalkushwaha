//Factorial Program In Java

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q41_Factorial {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int fact = 1;

        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }

        System.out.print(fact);

    }
}