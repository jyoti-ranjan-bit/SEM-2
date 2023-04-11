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
import java.util.*;
public class q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("enter element:");
				int g=sc.nextInt();
				arr[i][j]=g;
				sum = sum+g;
			}
		}
		int c = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) { 
			     System.out.print(arr[i][j]);
                 c++;
                 if (c==3){
                	 System.out.println();
                	 c=0;
			        }
			            }
			        }
			        System.out.println("the sum is:"+sum);
			    }
			}
			
