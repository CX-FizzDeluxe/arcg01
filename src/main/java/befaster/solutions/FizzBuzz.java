package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
//        String r = number.toString();
//        String r = String.format("%s%s", (number % 3 == 0) ? "fizz" : "",
//                                         (number % 5 == 0) ? " buzz" : "");
//        
        
        
        
        
             if (multipleOf3(number) && multipleOf5(number)) return "fizz buzz";
        else if (multipleOf3(number)) return "fizz";
        else if (multipleOf5(number)) return "buzz";
        else return number.toString();
    }

    private static boolean multipleOf5(Integer number) {
        return number % 5 == 0;
    }

    private static boolean multipleOf3(Integer number) {
        return number % 3 == 0;
    }

}
