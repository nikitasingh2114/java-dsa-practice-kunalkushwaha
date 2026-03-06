//Calculate Batting Average

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q49_BattingAverage {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter total runs");
        int totalRuns = Integer.parseInt(br.readLine());

        System.out.println("Enter number of times out");
        int timesOut = Integer.parseInt(br.readLine());

        double battingAverage = totalRuns/timesOut;

        System.out.println("Batting Average : " + battingAverage);
    }
}