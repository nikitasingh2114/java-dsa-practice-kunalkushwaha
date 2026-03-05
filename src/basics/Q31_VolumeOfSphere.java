//Volume Of Sphere

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q31_VolumeOfSphere {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());

        double volume = (4*3.14*radius*radius*radius)/3;

        System.out.println("The Volume of the Sphere is : "+ volume);


    }
}
