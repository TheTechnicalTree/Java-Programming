import java.util.Queue;
import java.util.LinkedList;

public class asd {
    public static void main(String[] args) {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        long num=0;
        for(int i=0; i<digits.length; i++){
            num=num*10+digits[i];
        }
        num+=1;
        System.out.println(num);
        long ans=num;
        int count=0;
        while(ans>0){
            ans=ans/10;
            count++;
        }
        int arr[]=new int[count];
        for(int i=count-1; i>=0; i--){
            arr[i]=(int)(num%10);
            System.out.println(arr[i]);
            num=num/10;
        }

    }

//    public static void main(String[] args) {
//        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        long num = 0;
//        for (int i = 0; i < digits.length; i++) {
//            num = num * 10 + digits[i];
//        }
//        num += 1;
//        System.out.println(num); // This will print 9876543211
//
//        long ans = num;
//        int count = 0;
//        while (ans > 0) {
//            ans = ans / 10;
//            count++;
//        }
//
//        int arr[] = new int[count];
//        for (int i = count - 1; i >= 0; i--) {
//            arr[i] = (int) (num % 10);
//            num = num / 10;
//        }
//
//        // Print the resulting array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//    }
}
