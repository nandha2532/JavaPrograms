package programs;

import java.util.ArrayList;

public class occurenceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Eliminate duplicates and print unique numbers in array
		
		int[] a = {1,4,8,17,15,4,4,8,8,9,15};
		
//		create a empty arrayList that store the number for first time
//		result 1-1, 4-3,8-3,17-1,15-2,9-1
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int n=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				n++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j])
						n++;
				}
				
				if(n==1)
					System.out.println(a[i]+" is a unique number");
				else
				System.out.println(a[i]+" has repeated "+ n +" times");
			}
		}
	}

}
