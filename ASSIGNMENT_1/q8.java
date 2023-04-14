/*Question-8:
Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array.
Sample Run:
Enter number of Row and Columns of 2D-Array: 3 3
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
The elements of 2D array are:
1 2 3
2 3 4
3 4 5
The sum of elements of the 2D-Array is 27*/
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = sc.nextInt();
        System.out.println("enter no of columns");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter the elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int k = sc.nextInt();
                arr[i][j] = k;
                sum = sum + k;// or sum=sum+arr[i][j];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(arr[i][j]);
                count++;
                if (count == 3) {
                    System.out.println();
                    count = 0;
                }
            }}

            System.out.println("the sum of elements of 2d array is: "+ sum);
        }
    }

