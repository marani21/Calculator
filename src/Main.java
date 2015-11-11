import calculating.Calculator;

import java.util.Scanner;
import java.lang.System.*;

/**
 * Created by Martyna on 2015-10-29.
 */
public class Main{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Enter an expression: ");
        System.out.print("Result: " + Calculator.evaluate(reader.next()));





    }
}

