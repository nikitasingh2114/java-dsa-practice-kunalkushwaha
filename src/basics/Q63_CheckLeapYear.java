//Check Leap Year Or Not

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q63_CheckLeapYear {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            sb.append("Leap Year\n");
        } else {
            sb.append("Not a Leap Year\n");
        }

        System.out.print(sb);

    }
}