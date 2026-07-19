package Arrays;

import java.util.Arrays;

public class FindingRange {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 4, 5, 5, 6};
        int target = 5;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] arr, int target) {

        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);  // First occurrence
        ans[1] = search(arr, target, false);  // Last occurrence

        return ans;
    }

    static int search(int[] arr, int target, boolean findFirstIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                // Target found
                ans = mid;

                if (findFirstIndex) {
                    end = mid - 1;     // Continue searching left
                } else {
                    start = mid + 1;    // Continue searching right
                }
            }
        }

        return ans;
    }
}
