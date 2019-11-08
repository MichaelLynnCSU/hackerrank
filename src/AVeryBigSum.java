public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
         long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
            // fruit is an element of the `fruits` array.
        }
        return sum;
    }

public static void main(String test[]){

    System.out.println(aVeryBigSum(new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005}));
}


}
