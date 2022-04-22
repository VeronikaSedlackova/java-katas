package PersistentBugger;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersistTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void oneDigitTest() {
        assertEquals(0, Persist.persistence(4));
    }

    @Test
    public void expectedValueOf1() {
        assertEquals(1, Persist.persistence(31));
    }

    @Test
    public void expectedValueOf2() {
        assertEquals(2, Persist.persistence(25));
    }

    @Test
    public void testTheFancyWay() {
        assertEquals(4, Persist.theFancyWay(999));
    }

}
