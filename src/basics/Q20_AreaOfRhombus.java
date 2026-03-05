//Area Of Rhombus

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q20_AreaOfRhombus {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double diagonal1 = Double.parseDouble(br.readLine());
        double diagonal2 = Double.parseDouble(br.readLine());

        double Area = (diagonal1*diagonal2)/2;

        System.out.println("The area of the Rhombus is : "+ Area);

    }
}