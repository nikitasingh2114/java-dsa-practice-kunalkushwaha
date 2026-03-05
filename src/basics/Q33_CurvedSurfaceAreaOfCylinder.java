//Curved Surface Area Of Cylinder

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q33_CurvedSurfaceAreaOfCylinder {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double CSA = 2*3.14*radius*height;

        System.out.println("The Curved Surface Area (CSA) of a cylinder is : "+ CSA);

    }
}
