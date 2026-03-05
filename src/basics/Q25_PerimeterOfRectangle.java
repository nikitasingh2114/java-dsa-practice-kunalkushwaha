//Perimeter Of Rectangle

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q25_PerimeterOfRectangle {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(br.readLine());
        double breadth = Double.parseDouble(br.readLine());

        double Perimeter = 2*(length+breadth);

        System.out.println("The perimeter of the Rectangle is : "+ Perimeter);


    }
}