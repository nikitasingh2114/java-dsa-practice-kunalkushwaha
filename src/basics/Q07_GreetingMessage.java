//Take name as input and print a greeting message for that particular name.

package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07_GreetingMessage {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println("Hello "+ str);

    }
}