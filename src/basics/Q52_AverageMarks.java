//Calculate Average Marks

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q52_AverageMarks {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter marks of all 5 subjects");
        double m1 = Double.parseDouble(br.readLine());
        double m2 = Double.parseDouble(br.readLine());
        double m3 = Double.parseDouble(br.readLine());
        double m4 = Double.parseDouble(br.readLine());
        double m5 = Double.parseDouble(br.readLine());

        double avg = (m1+m2+m3+m4+m5)/5;

        System.out.println("Average Marks : "+avg);
    }
}