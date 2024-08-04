package programs;

public class AdjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Max difference between any adjacent index in array
		int[] a = {1,4,8,17,15};
		int difference = maxDiff(a);
		System.out.println("Max difference between adjacent index : "+difference);
	}

	private static int maxDiff(int[] a) {
		// TODO Auto-generated method stub
		int diff=0;
		int adjDiff;
		for(int i=0;i<a.length-1;i++) {
			if(a[1]>a[i+1])
				adjDiff =a[i]-a[i+1];
			else
				adjDiff =a[i+1]-a[i];
			
			if(diff<adjDiff) {
				diff = adjDiff;
			}
			
		}
		return diff;
	}

}
