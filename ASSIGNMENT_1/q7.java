/*Question-7:
Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.
Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3.*/

import java.util.Scanner;
public class q7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the elements of array");
		for(int i=0;i<n;i++) {
			int g=sc.nextInt();
			arr[i]=g;
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max){
				max=arr[i];	
			}}
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min){
				min=arr[i];
			}}
		int max_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				max_count++;
			}
		}
		int min_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==min) {
				min_count++;
			}
		}
		int f_occ=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				f_occ=i;
				break;
			}}
		int l_occ=0;
		for(int i=(arr.length-1);i>0;i--) {
			if(arr[i]==min) {
				l_occ=i;
				break;
			}}
		System.out.println("Max element of Array is "+max+"and occurs "+max_count+" times");
		System.out.println("Max element of Array is "+min+"and occurs "+min_count+" times");
		System.out.println("First occurence of maximum element is at postion "+(f_occ+1));
		System.out.println("Last occurence of minimum element is at postion "+(l_occ+1));
		}
		
	}


