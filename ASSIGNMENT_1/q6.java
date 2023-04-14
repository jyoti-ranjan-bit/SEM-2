/*Question-6:

Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)
Sample Run:
Enter a number 37
37 is odd: true*/

import java.util.Scanner;

public class q6 {
    public static boolean isOdd(int n){
        boolean odd=false;
        for(int i=0;i<n;i++){
            odd=!odd;
        }
        return odd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n+" is odd: "+isOdd(n));

    }
}
