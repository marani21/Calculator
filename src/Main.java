import calculating.Calculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.lang.System.*;

/**
 * Created by Martyna on 2015-10-29.
 */
public class Main{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Enter an expression: ");
        showResult(reader.next());
    }

    public static void showResult(String expression){

         String result = String.valueOf(Calculator.evaluate(expression));
         System.out.println("Result: " + result);
    }
}

