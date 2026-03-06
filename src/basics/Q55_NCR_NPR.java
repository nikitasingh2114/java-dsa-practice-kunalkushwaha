//Find Ncr & Npr

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q55_NCR_NPR {
    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter total elements (n)");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter elements to select (r)");
        int r = Integer.parseInt(br.readLine());

        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        int nPr = factorial(n) / factorial(n - r);

        System.out.println("nCr : " + nCr);
        System.out.println("nPr : " + nPr);

    }
}