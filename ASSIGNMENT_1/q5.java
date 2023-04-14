/*Question-5:
Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
 Let n = 9294
 Sum = 9 + 2 + 9 + 4 = 24
 Sum = 2 + 4 = 6
Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6*/
import java.util.Scanner;

public class q5 {
    public static int sum_of_digits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if (sum >= 10)
            return sum_of_digits(sum);

        else {
            return sum;
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a no");
            int x=sc.nextInt();
            System.out.print("sum of digit until the no is single digit is "+sum_of_digits(x));
        }

    }
