package com.Arrays;

public class FindingPivot {
    public static void main(String[] args) {
    	int [] arr={4, 5, 6, 7, 9, 1, 2};
    
        System.out.println("Pivot index value: "+findPivot(arr));
        System.out.println("Pivot is: "+arr[findPivot(arr)]);
        
    }

	 static int findPivot(int[] arr) {
		int s=0;
		int e=arr.length-1;
		
		while(s<=e) {
			int m=s+(e-s)/2 ;
			 if(m<e && arr[m]> arr[m+1]) {
				 return m;
			 }
			 if(m>s && arr[m]<arr[m-1]) {
				 return m-1 ;
			 }
			 if(arr[m]<=arr[s]) {
				 e=m-1;
			 }
			 else {
				 s=m+1;
			 }
			
		}
		
		return -1;
	}
}
