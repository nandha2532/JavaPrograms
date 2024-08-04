package programs;

public class SumofElements {

//	Create method that accepts Array and returns sum of all the elements in the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		
		sumofArray(a);
		int product  =  multiply(5,10);
		System.out.println("Product is : "+product);
	}



	private static int sumofArray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of elemnts in the array : "+sum);
		return 0;
	}
	
	private static int multiply(int i, int j) {
	// TODO Auto-generated method stub
		
//		i has to sum j times to get the product as result
		int k=1;
		int sum = 0;
	
		while(k<=j) {
			sum = sum+i;
			k++;
		}
		
	return sum;
	}
}
