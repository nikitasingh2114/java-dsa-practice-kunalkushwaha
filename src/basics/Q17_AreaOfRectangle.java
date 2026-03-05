//Area Of Rectangle Program

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q17_AreaOfRectangle {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(br.readLine());
        double breadth = Double.parseDouble(br.readLine());

        double Area = length*breadth;

        System.out.println("The area of the Rectangle is : "+ Area);


    }
}