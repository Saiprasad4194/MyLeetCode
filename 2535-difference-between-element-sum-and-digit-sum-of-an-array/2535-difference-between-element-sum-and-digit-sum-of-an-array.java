class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
            temp=nums[i];
            while(temp>0){
                digitsum+=temp%10;
                temp/=10;
            }
        }
        return Math.abs(elementsum-digitsum);
    }
}