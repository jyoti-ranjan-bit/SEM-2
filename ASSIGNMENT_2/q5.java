package dsa_assignment_2;
class Deposit{
	long principal;
	int time;
	double rate,total_amt;
	Deposit(){}
	Deposit(long principal,int time,double rate){
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long principal,int time){
		this.principal=principal;
		this.time=time;
	}
	Deposit(long principal,double rate){
		this.principal=principal;
		this.rate=rate;
	}
	void display() {
		System.out.println(principal+"        "+time+"     "+rate+"        "+total_amt);
	}
	void calc_amt() {
		total_amt=principal + ((principal * rate * time) / 100.0);
	}}
public class q5 {

	public static void main(String[] args) {
	System.out.println("Principal"+"  "+"Time"+"  "+"rate"+"  "+"Total_amt");
		Deposit d1=new Deposit();
		d1.display();
	Deposit d2=new Deposit(1000,2,5.0);
	 d2.calc_amt();
     d2.display();
     Deposit d3=new Deposit(2500,3);
	 d3.calc_amt();
     d3.display();
     Deposit d4=new Deposit(2500,4.2);
	 d3.calc_amt();
     d3.display();

}}
