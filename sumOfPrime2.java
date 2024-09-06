import java.util.*;

public class sumOfPrime2 {

    public static boolean isNonPrime(int number) {
        if (number <= 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOfNonPrimeIndexValues(int[] input1, int input2){
        int sum=0;
        for(int i=0; i<input1.length;i++){
            int a=i;
            int b=0;
            if (a <= 1) {
                b=1;
            }
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    b=1;
                }
            }

            if(b==1){
                sum+=input1[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println(sumOfNonPrimeIndexValues(arr, 10));
    }
}
