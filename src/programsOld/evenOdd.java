package programsOld;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the starting number ");
		int noStart =  sc.nextInt();
		System.out.println("Enter the ending number ");
		int noEnd =  sc.nextInt();
		
		sc.close();
		int[] even = new int[noEnd-noStart];
		int e = 0;
		int[] odd = new int[noEnd-noStart];
		int od = 0;
		
		for(int i=noStart;i<=noEnd;i++) {
//			
//			if(i%2==0) {
////				System.out.println(i+"is an even Number");
//				even[e]=i;
//				e++;
//			}
//			if(i%2!=0) {
////				System.out.println(i+"is an odd Number");
//				odd[od]=i;
//				od++;
//			}
			if(isEven(i)) {
				even[e]=i;
				e++;
			}
			if(!isEven(i)) {
				odd[od]=i;
				od++;
			}
			
		}
		
		System.out.println("Even numbers in the range : ");
		for(int i=0;i<e;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println("");
		System.out.println("Odd numbers in the range : ");
		for(int i=0;i<od;i++) {
			System.out.print(odd[i]+" ");
		}
		
		
		int[] prime = new int[noEnd-noStart];
		int p = 0;
		int[] notPrime = new int[noEnd-noStart];
		int np = 0;
		
		for(int i=noStart;i<=noEnd;i++) {
			if(isPrime(i)) {
				prime[p]=i;
				p++;
			}
			if(!isPrime(i)) {
				notPrime[np]=i;
				np++;
			}
		}
		System.out.println("");
		System.out.println("Prime numbers in the range : ");
		for(int i=0;i<p;i++) {
			System.out.print(prime[i]+" ");
		}
		System.out.println("");
		System.out.println("Non Prime numbers in the range : ");
		for(int i=0;i<np;i++) {
			System.out.print(notPrime[i]+" ");
		}
			
	}
	
	public static boolean isEven(int num) {
		
		if(num%2==0) {
			return true;
		}
		return false;
		
	}

	public static boolean isPrime(int num) {


		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
