import java.util.Scanner;
public class q5 { 
public static int sum_Of_Digits(int n) {
	int sum=0;
	while(n>0 || sum>9 ) {
		if(n == 0) {
			n = sum;
			sum=0;
		}
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		System.out.println("sum of digit is until the no is single digit:"+ sum_Of_Digits(n));

	}

}
