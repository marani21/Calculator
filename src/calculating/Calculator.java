package calculating;


import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Martyna on 2015-10-29.
 */
public final class Calculator {

    public Calculator(){

    }

    public static float evaluate(String expression){

        checkCorrectness(expression);

        Stack<Float> stack = new Stack<Float>();
        ArrayList<String> tokens = RPN.splitToList(expression);
        ArrayList<String> convertedTokens = RPN.convertToONP(tokens);

        for (int i = 0; i < convertedTokens.size(); i++) {

            String z = convertedTokens.get(i);

            if (z.matches("[0-9.]+")) {

                stack.add(Float.parseFloat(z));
            } else {

                float b = stack.pop();
                float a = stack.pop();
                float r = 0;

                switch (z) {

                    case "+": {

                        r = Calculator.add(a, b);
                        break;
                    }
                    case "-": {

                        r = Calculator.subtract(a, b);
                        break;
                    }
                    case "*": {

                        r = Calculator.multiply(a, b);
                        break;
                    }
                    case "/": {

                        r = Calculator.divide(a, b);
                        break;
                    }
                }

                stack.push(r);
            }
        }

        return stack.peek();



    }



    private static void checkCorrectness(String expression) {

        if(expression.matches("(.*)/0[^.]*"))
        {
            throw new ArithmeticException("Nie wolno dzielic przez 0!");
        }
        else if(expression.matches("[^0-9+\\-*/ ]+"))

            throw new ArithmeticException("Niepoprawny format wyrazenia!");

    }

    protected static float add(float a, float b){

        float result = a + b;
        return result;
    }

    protected static float subtract(float a, float b){

        float result = a - b;
        return result;
    }

    protected static float multiply(float a, float b){

        float result = a * b;
        return result;
    }

    protected static float divide(float a, float b){


        float result = a/b;
        return result;
    }


}
