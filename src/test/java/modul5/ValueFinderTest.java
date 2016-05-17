package modul5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий.
 */
public class ValueFinderTest {
    @Test
    public void maxValueFinderTester() throws Exception {
        int mass [] = {1,2,3,4,5,6,7,8,9,21,0,-12};
        int result = ValueFinder.maxValueFinder(mass);
        Assert.assertEquals(21, result);
    }

    @Test
    public void minValueFinderTester() throws Exception {
        int mass [] = {1,2,3,4,5,6,7,8,9,21,0,-12};
        int result = ValueFinder.minValueFinder(mass);
        Assert.assertEquals(-12, result);

    }

}