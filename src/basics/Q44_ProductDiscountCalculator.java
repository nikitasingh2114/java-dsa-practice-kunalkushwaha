//Calculate Discount Of Product

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q44_ProductDiscountCalculator {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the amount of the product");
        double amount = Double.parseDouble(br.readLine());

        System.out.println("Enter discount percentage");
        double discount = Double.parseDouble(br.readLine());

        double discountCost = (amount * discount) / 100;

        double newRate = amount - discountCost;

        System.out.println("Discount : " + discountCost);
        System.out.println("Final Amount : " + newRate);

    }
}