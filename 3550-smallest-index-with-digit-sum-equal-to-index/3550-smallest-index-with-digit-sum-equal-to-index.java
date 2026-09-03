class Solution {
    public int smallestIndex(int[] nums) {
        int temp;
        int sum;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}