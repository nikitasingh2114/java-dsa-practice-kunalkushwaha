//Compound Interest Java Program

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q51_CompoundInterest {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Principle");
        double principle = Double.parseDouble(br.readLine());

        System.out.println("Enter Rate of Interest");
        double rateOfInterest = Double.parseDouble(br.readLine());

        System.out.println("Enter time");
        double time = Double.parseDouble(br.readLine());

        double amount = principle*Math.pow((1+(rateOfInterest/100.0)),time);

        double compoundInterest = amount - principle;

        System.out.println("Compound Interest : "+compoundInterest);
        System.out.printf("Compound Interest : %.2f", compoundInterest);

    }
}