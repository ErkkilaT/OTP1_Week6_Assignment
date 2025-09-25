import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {
    TimeCal cal = new TimeCal();
    @Test
    void calcTime() {

        assertEquals(1.5, cal.calcTime(150,100));
        assertEquals(1.0, cal.calcTime(100,100));
    }
}