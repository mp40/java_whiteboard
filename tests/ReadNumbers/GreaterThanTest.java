package ReadNumbers;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class GreaterThanTest {

    @org.junit.jupiter.api.Test
    public void simulateFail() {
//         fail();
    }

    @org.junit.jupiter.api.Test
    public void FindNumbersGreaterThanOrEqualTo9999() throws FileNotFoundException {
        GreaterThan numbers = new GreaterThan();
        int result = numbers.getResult();
        assertEquals(9899, result);
    }

}
