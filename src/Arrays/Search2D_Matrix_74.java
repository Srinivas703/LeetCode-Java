package Arrays;

public class Search2D_Matrix_74 {

	public static void main(String[] args) {
		int[][] matrix= {{1,3,5,7},
				         {10,11,16,20},
				         {23,30,34,60}
				         };
		int target=3;
		System.out.println(searchMatrix(matrix,target));
		System.out.println(searchMatrix_Method2(matrix,target));

	}

 public static int searchMatrix_Method2(int[][] matrix, int target) {
	 int rows=matrix.length;
	 int cols=matrix[0].length-1;
		int start=0;
		int end=rows*cols-1;
		while(start<=end) {
			int mid=start+(end-start)/2 ;
			int row= mid/cols ;
			int col=mid%cols ;
			if(target==matrix[row][col]) return target ;
			if(target<matrix[row][col]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
					
			
		}
		return -1;
	}

 public static boolean searchMatrix(int[][] matrix, int target) {
	 
	 for(int row=0;row<=matrix.length-1;row++) {
	      int start=0;
	      int end= matrix[row].length - 1;
	     while(start<end) {
	    	 int mid=start+(end-start)/2 ;
	    	 if(target==matrix[row][mid])return true;
	    	 if(target>matrix[row][mid]) {
	    		 start=mid+1;
	    	 }else {
	    		 end=mid-1;
	    	 }
	     }
	 }
      return false;  
    }
}
