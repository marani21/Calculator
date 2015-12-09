package calculating;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Martyna on 2015-12-09.
 */
public class RPN {

    protected static ArrayList<String> splitToList(String expression) {

        ArrayList<String> tokens = new ArrayList<String>();
        int j = 0;
        expression.trim();

        for (int i = 0; i < expression.length(); i++) {

            if (Character.isDigit(expression.charAt(i)) || expression.charAt(i)=='.') {

                if(tokens.size()>0) {

                    if(Character.isDigit(expression.charAt(i - 1)) || expression.charAt(i)=='.' || expression.charAt(i-1)=='.') {
                        String tmp = tokens.get(tokens.size()-1);
                        tmp += expression.charAt(i);
                        tokens.set(tokens.size()-1, tmp);

                    }
                    else{
                        tokens.add(Character.toString(expression.charAt(i)));
                    }
                }
                else{

                    tokens.add(Character.toString(expression.charAt(i)));
                }
            }
            else {

                tokens.add(Character.toString(expression.charAt(i)));
            }
        }

        return tokens;
    }


    private static int priority(char z){

        switch(z){

            case '/':{
                return 4;
            }
            case '*':{
                return 3;
            }
            case '-':{
                return 2;
            }
            case '+':{
                return 1;
            }
            default:{
                return 0;
            }
        }
    }

    // g³ówna metoda konwertuj¹ca wyra¿enie do ONP
    protected static ArrayList<String> convertToONP(ArrayList<String> tokens){

        Stack<String> stack = new Stack<String>();
        ArrayList<String> convertedTokens = new ArrayList<String>();
        String z;
        int p;
        int i=0;


        for(i=0; i<tokens.size(); i++) {

            z = tokens.get(i); // pierwszy element
            p = priority(z.charAt(0)); // jego priorytet



            //jeœli pierwszy znak jest minusem to zamieniamy go na wyra¿enie "0-"
            if (z.equals(new String("-")) && i == 0) {
                convertedTokens.add("0");
                stack.push("-");
            }
            else {

                // jeœli z jest liczb¹
                if(z.matches("[0-9.]+")){

                    convertedTokens.add(z);
                }
                //jeœli z jest czymœ innym (czyli operatorem)
                else{

                    // jeœli stos jest pusty lub jego ostatni element ma ni¿szy priorytet
                    if(stack.empty() || priority(stack.peek().charAt(0))<p){

                        stack.push(z);
                    }
                    // jeœli stos nie jest pusty i jego ostani element ma wy¿szy priorytet
                    else{

                        convertedTokens.add(stack.pop());
                        stack.push(z);
                    }

                }

            }


        }

        while(!stack.empty()){

            convertedTokens.add(stack.pop());
        }

        return convertedTokens;
    }

    public static double getResult(String expression){

        Stack<Float> stack = new Stack<Float>();
        ArrayList<String> tokens = splitToList(expression);
        ArrayList<String> convertedTokens = convertToONP(tokens);

        for(int i=0; i<convertedTokens.size(); i++) {

            String z = convertedTokens.get(i);

            if (z.matches("[0-9.]+")) {

                stack.add(Float.parseFloat(z));
            }
            else{

                float b = stack.pop();
                float a = stack.pop();
                float r = 0;

                switch(z){

                    case "+":{

                        r = Calculator.add(a,b);
                        break;
                    }
                    case "-":{

                        r = Calculator.subtract(a,b);
                        break;
                    }
                    case "*":{

                        r = Calculator.multiply(a,b);
                        break;
                    }
                    case "/":{

                        r = Calculator.divide(a,b);
                        break;
                    }
                }

                stack.push(r);
            }
        }

        return stack.peek();

    }
}
