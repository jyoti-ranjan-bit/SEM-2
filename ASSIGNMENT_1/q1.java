public class q1 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int count=0;int g=1;
		for(int i=1;i<n;i++) {
			g=g*2;
			count++;
			if(g>n) {
				break;
			}	
		}
		count=count-2;
		System.out.println("total no of time is "+ count);
	}

}
