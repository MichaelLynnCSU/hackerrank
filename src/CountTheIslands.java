import java.util.Arrays;
import java.util.List;

public class CountTheIslands {

   static public void dfsGrid(int[][] myMatrix, int i, int j){
        // look up
        if(i > 0 && myMatrix[i - 1][j] == 1){
            myMatrix[i - 1][j] = 0;
            dfsGrid(myMatrix,(i - 1),j);
        }
        // look down
        if(i < (myMatrix.length - 1) && myMatrix[i + 1][j] == 1){
            myMatrix[i + 1][j] = 0;
            dfsGrid(myMatrix,(i + 1),j);
        }
        // look left
        if(j > 0 && myMatrix[i][j - 1] == 1){
            myMatrix[i][j - 1] = 0;
            dfsGrid(myMatrix,i,(j - 1));
        }
        // look right
        if(j < (myMatrix[i].length - 1) && myMatrix[i][j + 1] == 1){
            myMatrix[i][j + 1] = 0;
            dfsGrid(myMatrix,i,(j + 1));
        }

        //-------------- check verticals --------------------------------//

       // look up/left
       if(i > 0 && j > 0 && myMatrix[i - 1][j - 1] == 1){
           myMatrix[i - 1][j - 1] = 0;
           dfsGrid(myMatrix,(i - 1),(j - 1));
       }
       // look up/right
       if(i > 0 && j < (myMatrix[i].length - 1) && myMatrix[i - 1][j + 1] == 1){
           myMatrix[i - 1][j + 1] = 0;
           dfsGrid(myMatrix,(i - 1),(j + 1));
       }

       // look down/left
       if(i < (myMatrix.length - 1)  && j > 0 && myMatrix[i + 1][j - 1] == 1){
           myMatrix[i + 1][j - 1] = 0;
           dfsGrid(myMatrix,(i + 1),(j - 1));
       }
       // look down/right
       if(i < (myMatrix.length - 1) && j < (myMatrix[i].length - 1) && myMatrix[i + 1][j + 1] == 1){
           myMatrix[i + 1][j  + 1] = 0;
           dfsGrid(myMatrix,(i + 1),(j + 1));
       }



    }




   static public int countIslands(int[][] myMatrix) {
        int count = 0;

        for(int i = 0; i < myMatrix.length; i++)
        {
            for(int j = 0; j < myMatrix[i].length; j++)
            {
                if(myMatrix[i][j] == 1){
                    myMatrix[i][j] = 0;
                    dfsGrid(myMatrix,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String test[]){


    }



}
