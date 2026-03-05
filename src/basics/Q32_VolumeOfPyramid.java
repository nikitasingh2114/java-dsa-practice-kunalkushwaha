//Volume Of Pyramid

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q32_VolumeOfPyramid {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double baseLength = Double.parseDouble(br.readLine());
        double baseWidth = Double.parseDouble(br.readLine());
        double pyramidHeight = Double.parseDouble(br.readLine());


        double volume = (baseLength*baseWidth*pyramidHeight)/3;

        System.out.println("The Volume of the Pyramid is : "+ volume);

    }
}
