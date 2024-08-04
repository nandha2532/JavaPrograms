package programsOld;

import java.util.Scanner;

public class GreatestOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		sc.close();
		if(n1>n2&n1>n3) {
			System.out.println(n1+" is greater");
		}
		else if(n2>n1&n2>n3) {
			System.out.println(n2+" is greater");
		}
		else if(n3>n1&n3>n2) {
			System.out.println(n3+" is greater");
		}
		else if(n1==n2|n2==n3|n1==n3) {
			if(n1==n2) {
				if(n1==n3) {
					System.out.println("All are equal");
				}
				else if(n1<n3) {
					System.out.println(n3+" is greater");
				}
				else
					System.out.println(n1+" is greater");
			}
			if(n2==n3) {
				
				if(n1>n3) {
					System.out.println(n1+" is greater");
				}
				else
					System.out.println(n2+" is greater");
			}
			if(n1==n3) {
				
				if(n1<n2) {
					System.out.println(n2+" is greater");
				}
				else
					System.out.println(n1+" is greater");
			}
			
		}
	}

}
