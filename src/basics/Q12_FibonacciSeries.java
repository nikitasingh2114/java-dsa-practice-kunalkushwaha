//To calculate Fibonacci Series up to n numbers.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12_FibonacciSeries {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sum;

        int a = 0, b = 1;
        sb.append(a+ " ").append(b+ " ");
        while(a!=num)
        {
            sum = a+b;
            sb.append(sum).append(" ");
            a = b;
            b = sum;
        }

        System.out.println(sb);

    }
}