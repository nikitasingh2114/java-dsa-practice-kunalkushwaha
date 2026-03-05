//Perimeter Of Parallelogram

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q24_PerimeterOfParallelogram {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double base = Double.parseDouble(br.readLine());
        double side = Double.parseDouble(br.readLine());

        double Perimeter = 2*(base*side);

        System.out.println("The perimeter of the Parallelogram is : "+ Perimeter);

    }
}