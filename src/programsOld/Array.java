package programsOld;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to be searched :");
		int num = sc.nextInt();

		int[] a = {1,2,4,5,6,3,8,7,9,0};
		int[] b= {1,2,3,4,5};//Array in sorted order
//		Linear search
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				
				count++;
				break;
				
			}
		}
		if(count==0) {
		System.out.println("Number is not available in the array");
		}
		else {
			System.out.println("Number is present in the array");
		}
		
//		SearchUsingMethod

		System.out.println(Arrays.binarySearch(b, num));//Array should be in sorted order
	
		
//		Max of an array
		int max =a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max =a[i];
			}
		}
		
		System.out.println("Max of the array is : "+max);
		
//		Min of an array
		int min =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min =a[i];
			}
		}
		
		System.out.println("Max of the array is : "+min);
		
		String ar[]= {"abc","xyz","pqr","mno"};
		System.out.println("Enter the STring to search in array :");
		Scanner sr = new Scanner(System.in);
		String s = sr.nextLine();
//		int num1 = sc.nextInt();


		boolean find = false;
//		for(String s : ar) {
		for(int i=0;i<ar.length;i++) {
			if(s.equals(ar[i])) {
				
				find =true;
				break;
				
			}
		}
		if(find==true) {
			System.out.println("String is present in the array");
		}
		else
			System.out.println("String is not avilable in the array");
		
		
//		Singe Dimension Array
		int arr[] = { 100, 200, 300, 400, 500 }; 
		// Declare an array without size and store values
		System.out.println("Length is : "+arr.length); // Prints length of an array
		for (int i : arr)
		{
		System.out.println(i);
		}
		// How to break for loop in the middle
		for (int i : arr)
		{
		if (i == 400)
		{
		break;
		}
		System.out.println(i);
		}
		int sum =0;
		for(int i:arr) {
			sum = sum+i;
		}

		System.out.println("Sum of the elements in the array : "+sum);
	}

}
