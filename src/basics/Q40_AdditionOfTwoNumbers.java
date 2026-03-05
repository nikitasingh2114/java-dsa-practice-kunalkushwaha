//Addition Of Two Numbers

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q40_AdditionOfTwoNumbers {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int sum = num1 + num2;
        System.out.println(sum);

    }
}