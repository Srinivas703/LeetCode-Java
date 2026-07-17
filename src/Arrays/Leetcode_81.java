package Arrays;

public class Leetcode_81 {

	public static void main(String[] args) {
		int[] nums= {2,5,6,0,0,1,2};
		int target=0;
		System.out.println(target+" At index : "+search(nums,target));

	}

	public static int search(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2 ;
			
			if(target==nums[mid]) {
				return mid;
			}
			//contains duplicate 
			if(nums[start]==nums[mid] && nums[mid]==nums[end]) {
				start++;
				end--;
				continue;
			}
			// Left half is sorted
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
		return -1;
	}

}
