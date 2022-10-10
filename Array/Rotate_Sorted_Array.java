package Array;

public class Rotate_Sorted_Array {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid])
                    high = mid;
                else
                    low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[hi])
                    low = mid + 1;
                else
                    high = mid;
            }
        }
        return -1;
    }
}
