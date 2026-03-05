//Calculate Average Of N Numbers

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q43_AverageOfNNumbers {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        double avg = 0.0;

        for(int i=0; i<n; i++)
        {
            int num = Integer.parseInt(br.readLine());
            sum += num;

        }

        avg = (double) sum/n;

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);

    }
}