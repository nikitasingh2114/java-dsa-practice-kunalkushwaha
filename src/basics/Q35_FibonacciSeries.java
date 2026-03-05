//Fibonacci Series In Java Programs

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q35_FibonacciSeries {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sum;
        int count = 0;

        int a = 0, b = 1;
        sb.append(a+ " ").append(b+ " ");
        while(count != num)
        {
            sum = a+b;
            sb.append(sum).append(" ");
            a = b;
            b = sum;
            count++;
        }

        System.out.println(sb);

    }
}