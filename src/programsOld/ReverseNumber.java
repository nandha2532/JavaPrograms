package programsOld;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();
		sc.close();
		
//		Number of digits
		
		int digit=0;
		int num= no;
		while(num!=0) {
			num= num/10;
			digit++;
		}
		System.out.println("NO. of Digits in the number is : "+digit);
		
//		Reverse a  number 
		
		int numRev =  no;
		int rev=0;
		while(numRev!=0) {
			rev = rev*10+numRev%10;
			numRev = numRev/10;
		}
		System.out.println("Reverse of the number is : "+rev);
		
//		palindrome
		if(rev==no) {
			System.out.println("Entered number is a Palindrome Number");
		}
		
//		INTEGER to STRING
		String numStr = String.valueOf(no);
		String ns = Integer.toString(no);
		System.out.println("Integer as String : "+ numStr +"& next "+ns);
		
		for(int i=1;i<5;i++) {
			System.out.println("Printa "+ i );
//			if(i==2) {
//				System.out.println("Print "+i);
//				break;
//			}

			if(i==2) {	
				break;
			}
			System.out.println("Printd "+ i );
		}

	}

}
