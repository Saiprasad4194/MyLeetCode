class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int min=i,max=0;
            for (int m=1;m<=i;m++){
                if (nums[m]>nums[max]){
                    max=m;
                }
            }
            for(int j=i;j<nums.length;j++){
                if (nums[j]<nums[min]){
                    min=j;
                }
            }
            if (nums[max]-nums[min]<=k) {
                return i;
            }

        }
        return -1;
    }
}