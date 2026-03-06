//Calculate Depreciation of Value

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q48_DepreciationCalculator {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the old amount of the product");
        double amount = Double.parseDouble(br.readLine());

        System.out.println("Enter depreciation rate");
        double rate = Double.parseDouble(br.readLine());

        double depreciationAmount = (amount * rate) / 100;

        double newRate = amount - depreciationAmount;

        System.out.println("Final Amount : " + newRate);

    }
}