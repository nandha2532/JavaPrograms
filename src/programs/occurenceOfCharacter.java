package programs;

import java.util.Scanner;

public class occurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 	count the number of occurrence of characters in a String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word = sc.nextLine(); //SELENIUM
		System.out.println("Enter the character : ");
		char letter = sc.next().charAt(0);
		sc.close();
		
		int count = occofChar(word,letter);
		
		System.out.println("'"+letter+"'"+" has repeated "+count+" times in the word : "+ word);
		
	}

	private static int occofChar(String word, char letter) {
		// TODO Auto-generated method stub
		
		int n=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)  ==letter) {
				n++;
			}	
		}
		
		
		return n;
	}


}
