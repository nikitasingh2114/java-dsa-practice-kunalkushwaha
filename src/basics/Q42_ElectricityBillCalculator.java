//Calculate Electricity Bill
/*
| Units Consumed  | Cost per Unit  |
        | --------------- | -------------- |
        | 0 – 100 units   | ₹1.20 per unit |
        | 101 – 200 units | ₹2.00 per unit |
        | 201 – 400 units | ₹3.00 per unit |
        | Above 400 units | ₹5.00 per unit |

After calculating the bill amount, add a 20% surcharge if the bill exceeds ₹400.
 */

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q42_ElectricityBillCalculator {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int units = Integer.parseInt(br.readLine());
        double bill = 0.0;

        if(bill<0)
            bill = 0;
        else if(units >=0 && units <= 100)
            bill = units * 1.20;
        else if(units>100 && units<=200)
            bill = 100*1.20 + (units-100)*2.0;
        else if(units>200 && units<=400)
            bill = 100*1.20 + 100*2.0 + (units-200)*3.0;
        else
            bill = 100*1.20 + 100*2.0 + 200*3.0 + (units-400)*5.0;

        if(bill>400)
            bill = bill + (bill*20)/100;

        System.out.println("Bill : "+bill);
    }
}