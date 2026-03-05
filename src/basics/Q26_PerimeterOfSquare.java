//Perimeter Of Square

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q26_PerimeterOfSquare {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double side = Double.parseDouble(br.readLine());

        double Perimeter = 4*side;

        System.out.println("The perimeter of the Square is : "+ Perimeter);

    }
}