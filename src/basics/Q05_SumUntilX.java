//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05_SumUntilX {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        while(true)
        {
            String num = br.readLine();
            if(num.equals("x"))
                break;
            int num1 = Integer.parseInt(num);
            sum+=num1;
        }
        System.out.println(sum);
    }

}
