import org.junit.Assert;
import org.junit.Test;

public class CountTheIslandsTest {

    @Test
    public void testingCountIslands() {
        CountTheIslands testing = new CountTheIslands();

    Integer[][] myMatrix = {
            { 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1 }
    };
        Assert.assertEquals(5, testing.countIslands(myMatrix));
    }

}