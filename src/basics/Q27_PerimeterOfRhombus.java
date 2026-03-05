//Perimeter Of Rhombus

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q27_PerimeterOfRhombus {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double side = Double.parseDouble(br.readLine());

        double Perimeter = 4*side;

        System.out.println("The perimeter of the Rhombus is : "+ Perimeter);

    }
}