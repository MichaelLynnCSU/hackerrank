import java.util.Arrays;
import java.util.List;

public class CountIslandsBooleanSolution {

    static public void dfsGrid(int[][] myMatrix, int i, int j, boolean[][] processed){
        // look up
        if(i > 0 && myMatrix[i - 1][j] == 1){
            myMatrix[i - 1][j] = 0;
            dfsGrid(myMatrix,(i - 1),j,processed);
        }
        // look down
        if(i < (myMatrix.length - 1) && myMatrix[i + 1][j] == 1){
            myMatrix[i + 1][j] = 0;
            dfsGrid(myMatrix,(i + 1),j,processed);
        }
        // look left
        if(j > 0 && myMatrix[i][j - 1] == 1){
            myMatrix[i][j - 1] = 0;
            dfsGrid(myMatrix,i,(j - 1),processed);
        }
        // look right
        if(j < (myMatrix[i].length - 1) && myMatrix[i][j + 1] == 1){
            myMatrix[i][j + 1] = 0;
            dfsGrid(myMatrix,i,(j + 1),processed);
        }

        //-------------- check verticals --------------------------------//

        // look up/left
        if(i > 0 && j > 0 && myMatrix[i - 1][j - 1] == 1){
            myMatrix[i - 1][j - 1] = 0;
            dfsGrid(myMatrix,(i - 1),(j - 1),processed);
        }
        // look up/right
        if(i > 0 && j < (myMatrix[i].length - 1) && myMatrix[i - 1][j + 1] == 1){
            myMatrix[i - 1][j + 1] = 0;
            dfsGrid(myMatrix,(i - 1),(j + 1),processed);
        }

        // look down/left
        if(i < (myMatrix.length - 1)  && j > 0 && myMatrix[i + 1][j - 1] == 1){
            myMatrix[i + 1][j - 1] = 0;
            dfsGrid(myMatrix,(i + 1),(j - 1),processed);
        }
        // look down/right
        if(i < (myMatrix.length - 1) && j < (myMatrix[i].length - 1) && myMatrix[i + 1][j + 1] == 1){
            myMatrix[i + 1][j  + 1] = 0;
            dfsGrid(myMatrix,(i + 1),(j + 1),processed);
        }



    }




    static public int countIslands(int[][] myMatrix) {

        int count = 0;
        int M = myMatrix.length;
        int N = myMatrix[0].length;
        // finish later
        boolean[][] processed = new boolean[M][N];

        for(int i = 0; i < myMatrix.length; i++)
        {
            for(int j = 0; j < myMatrix[i].length; j++)
            {
                if(myMatrix[i][j] == 1){
                    myMatrix[i][j] = 0;
                    dfsGrid(myMatrix,i,j,processed);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String test[]){

        int[][] myMatrix = {
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 }
        };


        System.out.println(countIslands(myMatrix));

    }



}
