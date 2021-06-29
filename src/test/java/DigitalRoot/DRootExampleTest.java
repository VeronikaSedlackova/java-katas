package DigitalRoot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DRootExampleTest {

    @Test
    public void Test1() {
        assertEquals("Nope!", 7, DRoot.digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals("Nope!", 6, DRoot.digital_root(456));
        assertEquals("Nope!", 9, DRoot.digital_root(4500));
        assertEquals("Nope!", 6, DRoot.digital_root(600));
        assertEquals("Nope!", 6, DRoot.digital_root(123));
        assertEquals("Nope!", 1, DRoot.digital_root(145));


    }
}
