import java.util.*;
public class q9 {
	public static double sumMajorDiagonal(double[][]m) {
		Scanner sc=new Scanner(System.in);
		int n=4;
		int t=4;
		double sum=0;
		double arr[][]=new double[n][t];
		for (int i=0;i<n;i++) {
			for (int j=0;j<t;j++) {
				System.out.println("enter element:");
				double q=sc.nextDouble();
				arr[i][j]=q;
				sum=sum+q;
			}
		}
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<t;j++) {
				System.out.println(arr[i][j]+"");
				c++;
				if(c==4) {
					System.err.println();
					c=0;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		double[][]arr=new double[4][4];
		double s=sumMajorDiagonal(arr);
		System.out.println(s);
		

	}

}
