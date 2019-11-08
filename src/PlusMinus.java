import java.text.DecimalFormat;

public class PlusMinus {

    static void plusMinus(int[] arr) {

        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                neg++;
            }
            else if(arr[i] > 0){
                pos++;
            }
            else{
                zero++;
            }
            // fruit is an element of the `fruits` array.
        }

        System.out.println(String.format("%.6f", pos / arr.length));
        System.out.println(String.format("%.6f", neg / arr.length));
        System.out.println(String.format("%.6f", zero / arr.length));
    }

    public static void main(String test[]){

        int array[] = {-4, 3, -9, 0, 4, 1};
        plusMinus(array);

    }


}
