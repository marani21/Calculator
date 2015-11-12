package calculating;


import java.util.List;
import java.util.ArrayList;

/**
 * Created by Martyna on 2015-10-29.
 */
public final class Calculator {

    public Calculator(){

    }

    public static float evaluate(String expression)
    {
        float result=0F;

        List<Float> numbers = new ArrayList<Float>();
        List<Character> operators = new ArrayList<Character>();


        numbers = splitNumbers(expression);
        operators = splitOperators(expression);

       //System.out.println(numbers);
       //System.out.println(operators);


        switch (operators.get(0)) {

            case'+':
            {
                result = add(numbers.get(0), numbers.get(1));
                break;
            }
            case'-':
            {
                result = subtract(numbers.get(0), numbers.get(1));
                break;
            }
            case'*':
            {
                result = multiply(numbers.get(0), numbers.get(1));
                break;
            }
            case'/':
            {
                result = divide(numbers.get(0), numbers.get(1));
                break;
            }
            default:
            {
                result = 0F;
                break;
            }
        }

        return result;
    }


    private static boolean isFirstNegative(String expression){

        if(expression.charAt(0)=='-')
            return true;
        else
            return false;
    }

    private static float add(float a, float b){

        float result = a + b;
        return result;
    }

    private static float subtract(float a, float b){

        float result = a - b;
        return result;
    }

    private static float multiply(float a, float b){

        float result = a * b;
        return result;
    }

    private static float divide(float a, float b){


        float result = a/b;
        return result;
    }

    private static ArrayList<Float> splitNumbers(String expression){

        ArrayList<Float> numbers = new ArrayList<Float>();

        String splitedExpression[] = expression.split("[+\\-*/]");

        if(!isFirstNegative(expression)) {
            for (String i : splitedExpression) {
                i.trim();
                numbers.add(Float.parseFloat(i));
            }
        }
        else{
            numbers.add(-Float.parseFloat(splitedExpression[1]));
            for(int i=2; i<splitedExpression.length; i++) {
                splitedExpression[i].trim();
                numbers.add(Float.parseFloat(splitedExpression[i]));
            }
        }

        return numbers;
    }

    private static ArrayList<Character> splitOperators(String expression){

        ArrayList<Character> operators = new ArrayList<Character>();

        String splitedExpression[] = expression.split("[0-9.\\w]+");


        for(int i=1; i<splitedExpression.length; i++) {
            operators.add(splitedExpression[i].charAt(0));
        }

        return operators;

    }
}
