class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        min[n-1] = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
            if (nums[max] - min[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}