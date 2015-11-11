package calculating;


import java.util.List;
import java.util.ArrayList;

/**
 * Created by Martyna on 2015-10-29.
 */
public final class Calculator {

    public Calculator()
    {

    }

    public static float evaluate(String expression)
    {
        List<Float> numbers = new ArrayList<Float>();
        List<Character> operators = new ArrayList<Character>();


        String tmp[] = expression.split("[+\\-*/]");


        for(String i: tmp) {
            i.trim();
            numbers.add(Float.parseFloat(i));
        }

        tmp = expression.split("[0-9.\\t\\n\\x0b\\r\\f]+");


        for(int i=1; i<tmp.length; i++) {
            operators.add(tmp[i].charAt(0));
        }


//       System.out.println(numbers);
//       System.out.println(operators);
//       System.out.println(numbers.get(0));
//       System.out.println(numbers.get(1));

        Float result=0F;

        switch (operators.get(0)) {

            case'+':
            {
                result = numbers.get(0)+numbers.get(1);
                break;
            }
            case'-':
            {
                result = numbers.get(0)-numbers.get(1);
                break;
            }
            case'*':
            {
                result = numbers.get(0)*numbers.get(1);
                break;
            }
            case'/':
            {
                if(numbers.get(1)!=0)
                    result = numbers.get(0)/numbers.get(1);
                else
                    throw new IllegalArgumentException("Nie mozna dzielic przez 0!");
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
}
