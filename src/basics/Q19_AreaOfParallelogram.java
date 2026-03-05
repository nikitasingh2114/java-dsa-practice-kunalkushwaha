//Area Of Parallelogram

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q19_AreaOfParallelogram {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double base = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double Area = base*height;

        System.out.println("The area of the Parallelogram is : "+ Area);

    }
}