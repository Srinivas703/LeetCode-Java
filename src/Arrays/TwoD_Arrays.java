package Arrays;

import java.util.Arrays;

public class TwoD_Arrays {

	public static void main(String[] args) {
		int[][] arr= { 
				{1,2,3},//0 row
				{4,5,6},//1st row
				{7,8,9}//2nd row 
				
		};
		System.out.println(Arrays.toString(arr[0]));
		System.out.println("----------------");
		System.out.println(arr[1][2]);
		System.out.println("----------------");
		for(int i=0;i<3;i++) {
			System.out.println(arr[i][i]);
		}
		System.out.println("----------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println(" "); 
		}

	}

}
