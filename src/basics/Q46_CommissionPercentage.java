//Calculate Commission Percentage

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q46_CommissionPercentage {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter sells products worth");
        double sellsProductWorth = Double.parseDouble(br.readLine());

        System.out.println("Enter Commission rate");
        double commissionRate = Double.parseDouble(br.readLine());

        double commission = (sellsProductWorth*commissionRate)/100;

        System.out.println("Commission : "+commission);

    }
}