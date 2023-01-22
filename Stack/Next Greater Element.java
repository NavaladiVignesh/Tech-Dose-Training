package Stack;

public class Next
Greater Element
{

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = map.get(nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
            if (ans[i] == 0) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
