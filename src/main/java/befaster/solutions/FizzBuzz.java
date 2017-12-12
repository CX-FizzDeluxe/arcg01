package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
//        String r = number.toString();
//        String r = String.format("%s%s", (number % 3 == 0) ? "fizz" : "",
//                                         (number % 5 == 0) ? " buzz" : "");
//        
        
        
        
        
             if (isFizz(number) && isBuzz(number) && isDeluxe(number)) return "fizz buzz deluxe";
        else if (isFizz(number) && isBuzz(number)) return "fizz buzz";
        else if (isFizz(number)) return "fizz";
        else if (isBuzz(number)) return "buzz";
        else return number.toString();
    }

    static boolean isDeluxe(Integer number) {
        
        // A number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
        
        return number > 10 && allDigitsIdentical(number.toString());
    }

    static boolean allDigitsIdentical(String number) {

        char first = number.charAt(0);
        
        for (int i=1; i< number.length(); i++) {
            
            if (number.charAt(i) != first) {
                
                return false;
            }
        }
        
        return true;
    }

    private static boolean isBuzz(Integer number) {
        return number % 5 == 0  || number.toString().contains("5");
    }

    private static boolean isFizz(Integer number) {
        return number % 3 == 0 || number.toString().contains("3");
    }

}
