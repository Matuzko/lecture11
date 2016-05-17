package modul4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий.
 */
public class AreaTest {

    @Test
    public void triangleTester() throws Exception {
        int sideA = 5; int sideB = 6;
        int rightResult = (sideA * sideB) / 2;
        int result = Area.triangle(sideA, sideB);
        Assert.assertEquals(rightResult, result);
    }

    @Test
    public void rectangleTester() throws Exception {
        int sideA = 5; int sideB = 6;
        int rightResult = sideA * sideB;
        int result = Area.rectangle(sideA, sideB);
        Assert.assertEquals(rightResult, result);
    }

    @Test
    public void circleTester() throws Exception {
        int radius =  6;
        double rightResult = radius * radius * 3.14;
        double result = Area.circle(radius);
        Assert.assertEquals(rightResult, result);
    }

}