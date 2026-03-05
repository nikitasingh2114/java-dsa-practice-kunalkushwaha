//Area Of Circle Java Program

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q15_AreaOfCircle {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());

        double Area = 3.14*radius*radius;

        System.out.println("The area of the Circle is : "+ Area);

    }
}