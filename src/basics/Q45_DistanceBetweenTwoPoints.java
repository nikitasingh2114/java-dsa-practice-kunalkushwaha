//Calculate Distance Between Two Points

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q45_DistanceBetweenTwoPoints {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first point");
        int x1 = Integer.parseInt(br.readLine());
        int y1 = Integer.parseInt(br.readLine());

        System.out.println("Enter second point");
        int x2 = Integer.parseInt(br.readLine());
        int y2 = Integer.parseInt(br.readLine());

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1 , 2));

        System.out.println(distance);

    }
}