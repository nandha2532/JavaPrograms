package programs;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//fibonacci series = 0 1 1 2 3 5 8 13 	
//		Sum of two previous numbers will be the 3rd number
		int n = 15;
		int a = 0;
		int b = 1;
		int sum =0;
		int i=1;
		System.out.print(a+" "+b+" ");
		while(i<n) {
			sum = a+b;
			System.out.print(sum);
			System.out.print(" ");
//			1st iteration		a=0, b=1
//			2nd iteration		a=1, b=1(Sum)
//			3rd iteration		a=1, b=2(Sum)	
			a=b;
			b=sum;
			i++;	
		}

	}

}
