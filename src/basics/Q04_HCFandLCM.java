//Take 2 numbers as inputs and find their HCF and LCM.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04_HCFandLCM {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int temp;
        int product = num1*num2;

        //finding HCF via Euclidean method
        while(num2 != 0)
            {
                temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }

        int HCF = num1;
        int LCM = product / HCF;

        System.out.print("HCF " + HCF + " " + "LCM " + LCM);
    }
}

