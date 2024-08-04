package programs;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Print Minimum and Maximum in the multidimensional array
		int abc[][]= {{9,4,8},{5,4,21},{3,4,28}};
		int min = abc[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(abc[i][j]<min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println("Min of the array : "+min);
		
		
		int max = abc[0][0];
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(abc[i][j]>max)
					max = abc[i][j];
			}
		}
		
		System.out.println("Max of the array : "+max);
	}

}
