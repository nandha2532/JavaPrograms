package programs;

import java.util.Scanner;

public class occurenceOfCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 	count the number of occurrence of characters in a String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word = sc.nextLine(); //SELENIUM

		sc.close();
	
		for(int i=0;i<word.length();i++) {
			int n=1;
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(i) ==word.charAt(j)) {
					n++;
			}
			}
			if(n==1) 
				System.out.println(word.charAt(i) +" has occured only once in the word : "+ word);
			
			else 
				System.out.println(word.charAt(i)+" has repeated "+n+" times");
				
		}
		
	}


}
