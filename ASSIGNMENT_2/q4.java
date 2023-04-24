package dsa_assignment_2;
class product{
	int pid;
	int price;
	static int tot_price;
	product(int pi,int pric){
		this.pid=pi;
		this.price=pric;
		
	}
	void display(){
		System.out.println(pid+price);
	}
	public static int totalAmount(product[]prod) {
		for(int i=0;i<prod.length;i++) {
			tot_price=tot_price+prod[i].price;}
			return tot_price;
		
	}
}
public class q4 {

	public static void main(String[] args) {
		product[] ob=new product[5];
		ob[0]=new product(785432,199);
		ob[1]=new product(845753,79);
		ob[2]=new product(264535,999);
		ob[3]=new product(454121,749);
		ob[4]=new product(121312,149);
		
		 System.out.println("sl_no:"+" "+"Product_id");
		 for (int i = 0; i < ob.length; i++) {
			 System.out.print( (i+1)+"      ");
			 ob[i].display();
		 }
		 int total_price=product.totalAmount(ob);
		 System.out.println("total price is: "+total_price);
	}

}
