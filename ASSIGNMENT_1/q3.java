/*Question-3:
Write a java program to check whether a number is a spy number or not.
Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.
Sample Run:
Enter a number: 1124
1124 is a spy number.*/
import java.util.*;
public class q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no: ");
	int n=sc.nextInt();
	int sum=0;int prod=1;
	while(n>0) {
		int r=n%10;
		sum=sum+r;
		prod=prod*r;
		n=n/10;
	}
	if (sum==prod) {
		System.out.println("spy number");
	}
	else {
		System.out.println("not a spy number");
	}

	}

}
