public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

        for(int i = 0; i < n; i++) {

            for(int k = ((n - 1) - i); k > 0; k--) {
                System.out.print(" ");
            }

            for(int j = -1; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }

    public static void main(String test[]){
        staircase(6);
    }


}
