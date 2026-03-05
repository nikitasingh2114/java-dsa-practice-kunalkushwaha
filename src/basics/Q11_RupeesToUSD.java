//Input currency in rupees and output in USD.
//1 dollar = Rs 91.77

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11_RupeesToUSD {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double inr = Double.parseDouble(br.readLine());

        double dollar = inr*91.77;
        System.out.println(inr + " in Dollars is : " + dollar);


    }
}