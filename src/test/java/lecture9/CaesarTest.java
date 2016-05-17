package lecture9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дима on 17.05.2016.
 */
public class CaesarTest {

    @Test
    public void fromNormalToCaesarTest() throws Exception {
        String abc = "abc";
        String result;
        result = Caesar.fromNormalToCaesar(abc);
        System.out.println(result);
        Assert.assertEquals("xyz", result);
    }

    @Test
    public void fromCaesarToNormalTest() throws Exception {
        String abc = "abc";
        String result;
        result = Caesar.fromCaesarToNormal(abc);
        System.out.println(result);
        Assert.assertEquals("def", result);


    }
}