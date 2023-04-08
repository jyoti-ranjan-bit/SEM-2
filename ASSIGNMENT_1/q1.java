public class q1 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int count=0;
		while (n>2) {
			count++;
			n=n/2;
		}
		
		System.out.println("total no of time one must repeatedly divide this number by 2 before getting a value less than 2 is "+ count);
	}

}
