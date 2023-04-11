/*Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
Sample Run:
The positive integer greater than 2 from command line argument
is 67.
The number of times one must repeatedly divide this number by 2
before getting a value less than 2 is 5.*/
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
