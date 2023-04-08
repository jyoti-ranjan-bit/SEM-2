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
