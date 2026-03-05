//Perimeter Of Equilateral Triangle

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q23_PerimeterOfEquilateralTriangle {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double side = Double.parseDouble(br.readLine());

        double Perimeter = 3*side;

        System.out.println("The perimeter of the Triangle is : "+ Perimeter);

    }
}