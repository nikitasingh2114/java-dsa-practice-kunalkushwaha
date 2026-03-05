//Volume Of Prism

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q29_VolumeOfPrism {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double baseArea = Double.parseDouble(br.readLine());
        double prismLength = Double.parseDouble(br.readLine());

        double volume =  baseArea * prismLength;

        System.out.println("The Volume of the Cone is : "+ volume);

    }
}
