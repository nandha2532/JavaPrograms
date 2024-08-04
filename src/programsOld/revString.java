package programsOld;

import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine(); //SELENIUM
		
		String orgString = s;

//		1. using for loop 
		
		int l = s.length();
		String rev = "";
		
		for(int i= l-1;i>=0;i--) {
			rev = rev+s.charAt(i);//MUINELES
		}
		System.out.println("Reverse of the String : "+rev);
		
		if(rev.equalsIgnoreCase(s))
			System.out.println("Entered Stirng is a Palindrome");
		
//		2. using StringBuffer class:
		
		StringBuffer sf = new StringBuffer(s);
		
		System.out.println("Reverse of the string using String Buffer : "+sf.reverse());

		if(s.equalsIgnoreCase(orgString))
			System.out.println("Entered Stirng is a Palindrome");
		
		System.out.println("Type a sentence : ");
		
//		Reverse of each word in a String
		String snt = sc.nextLine();

		sc.close();
		
		String[] words= snt.split(" ");
		String revSnt = "";
		for(int i=0;i<words.length;i++) {
			
			revSnt = revSnt+reverseString(words[i])+" ";
			
		}
		
		System.out.println("Reverse of each word of sentence : "+revSnt);
	}
	
	public static StringBuffer reverseString(String s) {
//		String revs = "";
//		for(int i=s.length()-1;i>=0;i--) {
//			revs = revs+s.charAt(i);
//		}
		
		StringBuffer sfr = new StringBuffer(s);
		
		return sfr.reverse();
	}
	
	
}
