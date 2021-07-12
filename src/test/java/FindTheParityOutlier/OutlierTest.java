package FindTheParityOutlier;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class OutlierTest {
    @Test
    public void testExample() {
        int[] exampleTest1 = {2, 3, 8, -10, 6};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, FindOutlier.find(exampleTest1));
        assertEquals(206847684, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));
    }
    @Test
    public void testExample2() {
        int[] exampleTest4 = {1, 3, 5, 9, 2};
        assertEquals(2, FindOutlier.find(exampleTest4));

    }


}