package modul5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дима on 14.05.2016.
 */
public class MassiveSortTest {

    @Test
    public void massiveSort() throws Exception {
        int mass[]= {2,54,3,7,2,1,9,34};
        int massSorted [] = {1,2,2,3,7,9,34,54};
        int massResult [] = MassiveSort.massiveSort(mass);
        Assert.assertEquals(massSorted[1],massResult[1]);
    }
}