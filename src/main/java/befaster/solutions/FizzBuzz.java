package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
//        String r = number.toString();
        String r = String.format("%s%s", (number % 3 == 0) ? "fizz" : "",
                                         (number % 5 == 0) ? " buzz" : "");
        
        
        
        
        
        if (number % 3 == 0) r = "fizz";
        if (number % 5 == 0) r += "buzz";
        
        
        
    }

}
