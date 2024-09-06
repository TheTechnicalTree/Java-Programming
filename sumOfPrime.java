import java.util.*;

public class sumOfPrime {

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
            if(isNonPrime(i)){
                sum+=input1[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={-4,-2};
        System.out.println(sumOfNonPrimeIndexValues(arr, 10));
    }
}
