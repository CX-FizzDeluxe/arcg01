package befaster.solutions;

import java.util.Optional;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
//        String r = number.toString();
//        String r = String.format("%s%s", (number % 3 == 0) ? "fizz" : "",
//                                         (number % 5 == 0) ? " buzz" : "");
//        
        
        
        
        
//             if (isFizz(number) && isBuzz(number) && isDeluxe(number)) return "fizz buzz deluxe";
             
            String fb = fb(number);
            
            Optional<String> deluxeStr = deluxeStr(number);
            
            if (fb != null) {
                
                return fb + (deluxeStr.isPresent() ? " " + deluxeStr.get() : ""); // map +_orElse?
            }
            else 
            {
//                return deluxeStr.orElse(number.toString()); // ??
                return number.toString(); // or this?
                
//                return isDeluxe(number) ? "deluxe" : number.toString();
            }
    }

    private static Optional<String> deluxeStr(Integer number) {
        
        //   - If a "deluxe" number is odd, we should call him "fake deluxe"
        
        Optional<String> r = isDeluxe(number) ? Optional.of("deluxe") : Optional.empty();
        
        return r.map(s -> (number % 2 == 1) ? "fake " + s
                                            : s);
    }
    
//    private static Optional<String> deluxeStr(Integer number) {
//        
//        // odd -> "fake deluxe" 
//        // _   -> "deluxe"
//        
//        Optional<String> r = isDeluxe(number) ? Optional.of("deluxe") : Optional.empty();
//        
//        return  (number % 2 == 1) ? "fake deluxe"
//                                     : "deluxe"
//                                     ;
//        
//        return Optional.of(r);
//    }

    private static String fb(Integer number) {
        
               if (isFizz(number) && isBuzz(number)) return "fizz buzz";
          else if (isFizz(number)) return "fizz";
          else if (isBuzz(number)) return "buzz";
    //        else if (isDeluxe(number)) return "deluxe";
          else return null;
    }

//    static boolean isDeluxe(Integer number) {
//        
//        // A number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
//        
//        return number > 10 && allDigitsIdentical(number.toString());
//    }
    
    static boolean isDeluxe(Integer number) {
        
        return (number % 3 == 0 && number.toString().contains("3"))
            || (number % 5 == 0 && number.toString().contains("5"))
            ;
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
        return number % 5 == 0 || number.toString().contains("5");
    }

    private static boolean isFizz(Integer number) {
        return number % 3 == 0 || number.toString().contains("3");
    }

}
