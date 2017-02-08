package javaeight.testing;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;

/**
 * Created by jpowel on 08/02/2017.
 */
public class DurationTest {
    private static final Properties PARAM = new Properties();
    private Duration duration = new Duration();

    @Before
    public void setUp() {
        PARAM.setProperty("a", "5");
        PARAM.setProperty("b", "true");
        PARAM.setProperty("c", "-3");
    }

    @Test
    public void testOrig() {
        assertEquals(5, duration.readDurationOrig(PARAM, "a"));
        assertEquals(0, duration.readDurationOrig(PARAM, "b"));
        assertEquals(0, duration.readDurationOrig(PARAM, "c"));
        assertEquals(0, duration.readDurationOrig(PARAM, "d"));
    }

    @Test
    public void testNew() {
        assertEquals(5, duration.readDuration(PARAM, "a"));
        assertEquals(0, duration.readDuration(PARAM, "b"));
        assertEquals(0, duration.readDuration(PARAM, "c"));
        assertEquals(0, duration.readDuration(PARAM, "d"));
    }
}
