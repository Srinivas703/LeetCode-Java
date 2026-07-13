package Arrays;

public class Split_ar_into_LargestSum_410 {

	public static void main(String[] args) {
		int[] nums= { 7, 2, 5, 10, 8};
		int m=2;
		System.out.println(SplitArrayLargestSum(nums,m));

	}

	 static int SplitArrayLargestSum(int[] nums, int m) {
		int start=0;
		int end=0;
		
		for(int i=0;i<nums.length;i++) {
			// Max element in the array = 10
			start= Math.max(start, nums[i]);
			end += nums[i];
			
		}
		
		//Here get array like (10,32), So array is Sorted We can perform BS
		
		while(start < end ) {
			int mid=start+(end-start)/2 ;
			int sum=0;
			int pieces=1;  // Every array have one sub Array so thats why we use 1 
			
			for(int num:nums) {
				if(sum+num>mid) {
					// Create new array
					sum=num;
					pieces++;
				}
				else {
					sum +=num;
				}
			}
			if(pieces>m) {
				start =mid+1;
			}else {
				end=mid;
			}
			
		}
		
		
		return start; // here start==end 
	}

}
