import org.junit.Assert;
import org.junit.Test;

public class CountTheIslandsTest {

    @Test
    public void testing_countIslands() {

        int[][] myMatrix = {
            { 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1 }
        };

        int M = myMatrix.length;
        int N = myMatrix[0].length;

        boolean[][] processed = new boolean[M][N];


        CountTheIslands testing = new CountTheIslands();
        Assert.assertEquals(5, testing.countIslands(myMatrix));
    }

}