package BinarySearch;

public class OrderAgnostic_BS {

	public static void main(String[] args) {
		int[] arr= {2,3,5,7,9,11,23};
		int target=11;
		System.out.println(target+" At index: "+search(arr,target));
	}

	static int search(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start + (end-start)/2 ;
			if(arr[mid]==target) {
				return mid;
			}
			// ASC order
			if(arr[start]<arr[end]) {
				if(arr[mid]<target) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			// DESC order
			else {
				
				if(arr[mid]<target) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return -1;
	}

}
