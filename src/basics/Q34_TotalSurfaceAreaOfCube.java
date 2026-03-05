//Total Surface Area Of Cube

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q34_TotalSurfaceAreaOfCube {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double side = Double.parseDouble(br.readLine());

        double CSA = 6*side*side;

        System.out.println("The Curved Surface Area (CSA) of a Cube is : "+ CSA);

    }
}
