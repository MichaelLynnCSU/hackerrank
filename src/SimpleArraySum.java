import java.awt.desktop.SystemEventListener;

public class SimpleArraySum {

     int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum = sum + ar[i];
        }
                return sum;
                }

        public static void main(String test[]){
            SimpleArraySum k = new SimpleArraySum();
            System.out.println(k.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));
        }

}
