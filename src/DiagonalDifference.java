import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int count = 0;
        int sum = 0;

        for (int i=0; i < arr.size(); i++) {
            if(count < arr.get(i).size()) {
                System.out.println(arr.get(i).get(count));
                sum = sum + arr.get(i).get(count);
                count++;
            }
                // Do stuff
        }

        int count2 = arr.get(0).size() - 1;
        int sum2 = 0;
        for (int i=0; i < arr.size(); i++) {
            if(count2 >= 0) {
                System.out.println(arr.get(i).get(count2));
                sum2 = sum2 + arr.get(i).get(count2);
                count2--;
            }
            // Do stuff
        }

        int abs = Math.abs(sum - sum2);
        return abs;
    }


    public static void main(String test[]){

        Integer myArray[][] = {
                        {11, 2, 4},
                         {4, 5, 6},
                         {10, 8, -12}
        };

        List<List<Integer>> arrayList2D = new ArrayList(myArray.length);

        for (Integer myTest[] : myArray) {
            arrayList2D.add(Arrays.asList(myTest));
        }

        System.out.println(diagonalDifference(arrayList2D));
    }

}
