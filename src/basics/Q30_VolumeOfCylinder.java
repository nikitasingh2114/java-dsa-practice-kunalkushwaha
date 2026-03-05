//Volume Of Cylinder

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q30_VolumeOfCylinder {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double volume = (3.14*radius*radius*height);

        System.out.println("The Volume of the Cylinder is : "+ volume);

    }
}
