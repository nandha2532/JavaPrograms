package programs;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bubble sort
//		Sort Array in Ascending and Descending order
		int[] a = {1,4,8,17,15};
		int[] b = {1,4,8,17,15};
		int[] ascend = ascenOrder(a);
		int[] descend = descenOrder(b);
		
		System.out.println("Ascending order : ");
		for(Object obj : ascend) {
			System.out.println(obj);
		}
		
		System.out.println("Descending order : ");
		for(Object obj : descend) {
			System.out.println(obj);
		}
		
		
		
//		swap using temp variable:
//		
//		int x=3;
//		int y=5;
//		int temp;
//		temp =x;
//		x=y;
//		y= temp;
		
//		swap without temp 
//		int x=3;
//		int y=5;
//		x= x+y;	// x=3+5 =8
//		y= x-y; // y=8-5 =3
//		x= x-y;	// x=8-3 =5
//	
	}

	public static int[] ascenOrder(int[] a) {

		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
//					Swap
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		return a;
	}
	
	public static int[] descenOrder(int[] a) {

		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] < a[j]) {
//					Swap
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		return a;
	}

}
