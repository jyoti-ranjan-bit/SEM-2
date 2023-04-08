import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person weight in kg:");
		double w=sc.nextDouble();
		System.out.println("Enter the height of person in metrer:");
		double h=sc.nextDouble();
		double bmi=w/(h*h);
		if (bmi <18.5) {
			System.out.println("underweight");
		}
		else if (bmi<25.0) {
			System.out.println("Normal weight");
		}
		else if(bmi<30.0) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obsese");
		}
	}

}
