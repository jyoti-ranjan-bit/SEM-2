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
