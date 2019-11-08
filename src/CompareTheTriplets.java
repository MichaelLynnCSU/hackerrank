import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> returnArray = new ArrayList<Integer>();
        returnArray.add(0);
        returnArray.add(0);

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                returnArray.set(0, returnArray.get(0) + 1);
            }
            else if(a.get(i) < b.get(i)) {
                returnArray.set(1, returnArray.get(1) + 1);
            }
            else{
                // do nothing
            }

        }

        return returnArray;
    }

    public static void main(String test[]){

        Integer array[] = { 1, 2, 3, 4, 10, 11};
        List<Integer> newArray = (Arrays.asList(array));

        Integer array2[] = { 1, 4, 3, 4, 9, 11};
        List<Integer> newArray2 = (Arrays.asList(array2));
        System.out.println(compareTriplets(newArray,newArray));

    }

}
