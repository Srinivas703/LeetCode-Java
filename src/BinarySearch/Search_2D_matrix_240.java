package BinarySearch;

public class Search_2D_matrix_240 {

	public static void main(String[] args) {
		int[][] arr= {
				      {1,4,7,11,15},
				      {2,5,8,12,19},
				      {3,6,9,16,22},
				      {10,13,14,17,24},
				      {18,21,23,26,30}
				     };
		int target = 6;
		System.out.println(Search(arr,target));

	}

	 static int Search(int[][] arr, int target) {
		 int row=0;
		 int col=arr[0].length-1;
		 while(row <arr.length && col >=0) {
			 if(target==arr[row][col]) {
				 return target;
			 }
			//  ------Key points--------
		        // left --->  Smaller elements
		        //right --->  Bigger elements
		        //up    --->  Smaller elements
		        //down  --->  Bigger elements 
			 if(target>arr[row][col]) {
				 row++;
			 }else {
				 col--;
			 }
			 
		 }
		return -1;
	}

}
