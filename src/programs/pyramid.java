package programs;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Program to print pyramid pattern
//	*
//	*	*
//	*	*	*
//	*	*	*	*
//	*	*	*	*	*
		
//		System.out.println("*");
		int n=10;
		
		
		for (int i = 1; i <=n; i++) {//decides the number of rows
			for (int j = 1; j <=i; j++) {//decides the number of star in each row
				System.out.print("*");
				if(j!=i)
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("Upward down pyramid");
		for (int i = n; i >=0; i--) {//decides the number of rows
			for (int j = 1; j <=i; j++) {//decides the number of star in each row
				System.out.print("*");
				if(j!=i)
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
