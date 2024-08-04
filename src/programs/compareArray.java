package programs;

import java.util.ArrayList;

public class compareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		compare same indexes of 2 different array and create another array for matching values
		int[] a = {1,4,8,17,15};
		int[] b = {0,4,8,1,15};
		
//		int[] m= new int[3];
//		another way of declaring array
//		if the no. of values to be stored is not known--> use array list(dynamic array)
		
		ArrayList<Integer> m = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == b[i])
			{
				m.add(a[i]);
			}
		}
		
		Object[] n= m.toArray();
//		for(int i=0;i<n.length;i++) {
//			System.out.println(n[i]);
//		}
		
		for(Object obj :n) {
			System.out.println(obj);
		}
			

	}

}
