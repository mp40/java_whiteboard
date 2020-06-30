package WiringTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class WiringTest {

    @org.junit.jupiter.api.Test
    public void simulateFail() {
        // fail();
    }

    @org.junit.jupiter.api.Test
    public void WiringTest() {
        Test wiringTest = new Test();
        String value = wiringTest.getWired();
        assertEquals("working", value);
    }
}
