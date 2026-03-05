//Take a number as input and print the multiplication table for it.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03_MultiplicationTable {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=100;i++)
        {
            sb.append(n).append("*").append(i).append("=").append(n*i).append("\n");
        }

        System.out.print(sb);
    }
}
