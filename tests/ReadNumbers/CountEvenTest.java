package ReadNumbers;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CountEvenTest {
    @org.junit.jupiter.api.Test
    public void simulateFail() {
//         fail();
    }

    @org.junit.jupiter.api.Test
    public void Largest() throws FileNotFoundException {
        CountEven numbers = new CountEven();
        int result = numbers.getResult();
        assertEquals(191, result);
    }
}
