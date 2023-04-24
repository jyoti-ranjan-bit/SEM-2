import java.util.*;
class phone{
	int area_code;
	int exchange;
	int number;
	public void input(int acode,int echnge,int no) {
		this.area_code=acode;
		this.exchange=echnge;
		this.number=no;
	}
	public void display() {
		System.out.println(area_code+" "+exchange+" "+number);
	}
}
public class q1 {
	public static void main(String[] args) {
		phone my=new phone();//class object
		my.input(212,767 ,8900 );
		System.out.print("My number is ");
        my.display();
        
        //yout ph number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your area code:");
        int a_code = sc.nextInt();
        System.out.println("enter exchange code:");
        int e_code = sc.nextInt();
        System.out.println("enter the number:");
        int num = sc.nextInt();
        phone your = new phone();//class object
        your.input(a_code,e_code,num);
        System.out.print("Your number is ");
        your.display();
		
	}

}
