package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
//        String r = number.toString();
//        String r = String.format("%s%s", (number % 3 == 0) ? "fizz" : "",
//                                         (number % 5 == 0) ? " buzz" : "");
//        
        
        
        
        
             if (isFizz(number) && isBuzz(number)) return "fizz buzz";
        else if (isFizz(number)) return "fizz";
        else if (isBuzz(number)) return "buzz";
        else return number.toString();
    }

    private static boolean isBuzz(Integer number) {
        return number % 5 == 0  || number.toString().contains("5");
    }

    private static boolean isFizz(Integer number) {
        return number % 3 == 0 || number.toString().contains("3");
    }

}
