package Arrays;

public class Leetcode_410 {

	public static void main(String[] args) {
		int[] arr= {7,2,5,10,8};
		int m=2;
		System.out.println(Searching(arr,m));

	}

	private static int Searching(int[] arr ,int m) {
		
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++) {
			start =Math.max(start, arr[i]); // get the highest number in array
			end +=arr[i];//get sum of all elements in array
		}
		 while(start<end) {
			 int mid=start+(end-start)/2 ;
			 int sum=0;
			 int pieces =1;
			 for(int nums:arr) {
				 if(sum+nums>mid) {
					 
					 pieces++;
					 sum=nums;// creating the new array
				 }else {
					 sum +=nums;
				 }
			 }
			 if(pieces>m) {
				 start=mid+1;
			 }else {
				 end=mid;
			 }
		 }
		
		
		
		
		return start; //here start==end
	}

}
