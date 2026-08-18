class Solution {
    public int largestInteger(int[] nums, int k) {
        int count=0;
        int []temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<=nums.length-k;j++){
                for (int x = j; x < j + k; x++) {
                    if (nums[x] == nums[i]) {
                        count++;
                        break;
                    }
                }
            }
            temp[i]=count;
        }
        int max=-1;
        int index=0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]==1) {
                if(nums[i]>max){
                    max=nums[i];
                }
            }
        }
        return max;
    }
}