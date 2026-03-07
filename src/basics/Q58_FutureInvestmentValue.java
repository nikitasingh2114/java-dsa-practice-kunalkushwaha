//Future Investment Value

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q58_FutureInvestmentValue {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Principlal");
        double principlal = Double.parseDouble(br.readLine());

        System.out.println("Enter Rate of Interest");
        double rateOfInterest = Double.parseDouble(br.readLine());

        System.out.println("Enter time");
        double time = Double.parseDouble(br.readLine());

        double amount = principlal*Math.pow((1+(rateOfInterest/100.0)),time);

        System.out.printf("Future Investment Value : %.2f", amount);

    }
}