package ReadNumbers;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LargestTest {

    @org.junit.jupiter.api.Test
    public void simulateFail() {
//         fail();
    }

    @org.junit.jupiter.api.Test
    public void Largest() throws FileNotFoundException {
        Largest numbers = new Largest();
        int result = numbers.getResult();
        assertEquals(999990, result);
    }
}

