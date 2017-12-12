package befaster.solutions;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test() {
 
        
        assertTrue(FizzBuzz.allDigitsIdentical("111111"));
        assertFalse(FizzBuzz.allDigitsIdentical("1110111"));
        
        assertFalse(FizzBuzz.isDeluxe(1));
        assertTrue(FizzBuzz.isDeluxe(11));
        assertTrue(FizzBuzz.isDeluxe(111));
        assertFalse(FizzBuzz.isDeluxe(112));
    }

}
