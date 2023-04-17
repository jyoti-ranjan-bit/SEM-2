/*Question-9:
Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.
Sample Run:
Enter a 4-by-4 matrix row by row:
1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16
Sum of the elements in the major diagonal is 34.5*/
import java.util.Scanner;

public class q9{
public static double sumMajorDiagonal(double[][]m){

double sum=0;
    for (int i=0;i<4;i++) {
        for (int j = 0; j < 4; j++) {
            if (i == j) {
                sum = sum + m[i][j];
            }
        }
    }
    return sum;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double arr[][]=new double[4][4];
        System.out.println("enter a 4x4 matrix by row:");
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                double n= sc.nextDouble();
                arr[i][j]=n;
            }
        }
        int count=0;
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                count++;
                System.out.print(arr[i][j]+" ");
                if(count==4){
                    System.out.println();
                    count=0;
                }
            }}
        System.out.println(sumMajorDiagonal(arr));

    }}
