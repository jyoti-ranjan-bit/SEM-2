/*Question-6:

Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)
Sample Run:
Enter a number 37
37 is odd: true*/

import java.util.Scanner;
public class q6 {
	public static boolean isOdd(int n) {
		boolean odd=false;
		for(int i=1;i<=n;i++) {
			odd=!odd;
		}
		return odd;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no: ");
		int n=sc.nextInt();
		if(isOdd(n)) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}

	}

}
