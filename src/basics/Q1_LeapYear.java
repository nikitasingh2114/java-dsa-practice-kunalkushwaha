package basics;

import java.io.*;

public class Q1_LeapYear {

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