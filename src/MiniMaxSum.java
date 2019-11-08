import java.util.Arrays;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
         long min = 0;
         long max = 0;

        for (int i=0; i < 4; i++){
            min = min + arr[i];
        }

        for (int i=arr.length - 1; i > ((arr.length - 1) - 4); i--){
            max = max + arr[i];
        }

        System.out.print(min + " " + max);

    }

    public static void main(String test[]){
        int[] arr = {1, 2, 3, 4, 5};
        miniMaxSum(arr);

    }

}
