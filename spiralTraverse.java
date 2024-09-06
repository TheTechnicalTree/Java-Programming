import java.util.*;
public class spiralTraverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int r=sc.nextInt();
//        int c=sc.nextInt();
//        int arr[][]= new int[r][c];
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int totalElement=0;
//        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
//        while(totalElement<r*c){
//            // topRow -> leftCol to rightCol
//            for(int i=leftCol; i<=rightCol && totalElement<r*c; i++){
//                System.out.print(arr[topRow][i] + " ");
//                totalElement++;
//            }
//            topRow++;
//
//            //rightCol -> topRow to bottomRow
//            for(int j=topRow; j<=bottomRow && totalElement<r*c; j++){
//                System.out.print(arr[j][rightCol]+ " ");
//                totalElement++;
//            }
//            rightCol--;
//
//            //bottomRow -> rightCol to leftCol
//            for(int i=rightCol; i>=leftCol && totalElement<r*c; i--){
//                System.out.print(arr[bottomRow][i] + " ");
//                totalElement++;
//            }
//            bottomRow--;
//
//            //leftCol -> bottomRow to topRow
//            for(int j=bottomRow; j>=topRow && totalElement<r*c; j--){
//                System.out.print(arr[j][leftCol] + " ");
//                totalElement++;
//            }
//            leftCol++;
//        }

        int n=sc.nextInt();
        int arr[][]= new int[n][n];
        int totalElement=0;
        int num=1;
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        while(totalElement<n*n){
            // topRow -> leftCol to rightCol
            for(int i=leftCol; i<=rightCol && totalElement<n*n; i++){
                arr[topRow][i]=num++;
                totalElement++;
            }
            topRow++;

            //rightCol -> topRow to bottomRow
            for(int j=topRow; j<=bottomRow && totalElement<n*n; j++){
                arr[j][rightCol]=num++;
                totalElement++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for(int i=rightCol; i>=leftCol && totalElement<n*n; i--){
                arr[bottomRow][i]=num++;
                totalElement++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for(int j=bottomRow; j>=topRow && totalElement<n*n; j--){
                arr[j][leftCol]=num++;
                totalElement++;
            }
            leftCol++;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
