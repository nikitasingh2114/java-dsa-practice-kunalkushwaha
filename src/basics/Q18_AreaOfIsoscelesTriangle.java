//Area Of Isosceles Triangle

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q18_AreaOfIsoscelesTriangle {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double base = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double Area = (base*height)/2;

        System.out.println("The area of the Triangle is : "+ Area);


    }
}