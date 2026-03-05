//Perimeter Of Circle

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q22_PerimeterOfCircle {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());

        double Perimeter = 2*3.14*radius;

        System.out.println("The perimeter of the Circle is : "+ Perimeter);

    }
}