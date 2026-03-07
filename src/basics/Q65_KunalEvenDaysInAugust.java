//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q65_KunalEvenDaysInAugust {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter no. of days in the month");
        int N = Integer.parseInt(br.readLine());

        System.out.println("No. of days allowed to go out with his friends : " + N/2 );
    }
}