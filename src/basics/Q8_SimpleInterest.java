//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q8_SimpleInterest {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double principle = Double.parseDouble(br.readLine());
        double time = Integer.parseInt(br.readLine());
        double rate = Double.parseDouble(br.readLine());

        double SI = (principle*time*rate)/100;

        System.out.println(SI);

    }
}