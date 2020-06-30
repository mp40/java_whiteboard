package CountNumbers;


import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumbers {

    @org.junit.jupiter.api.Test
    public void simulateFail() {
//         fail();
    }

    @org.junit.jupiter.api.Test
    public void Numbers() throws FileNotFoundException {
        Numbers numbers = new Numbers();
        int result = numbers.getResult();
        assertEquals(9899, result);
    }

}
