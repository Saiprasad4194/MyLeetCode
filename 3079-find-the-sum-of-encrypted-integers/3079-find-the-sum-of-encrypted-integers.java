class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int temp,max=0;
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            max=0;
            count=0;
            while(temp>0){
                int digit=temp%10;
                if(digit>max){
                    max=digit;
                }
                count++;
                temp/=10;
            }
            int newd=0;
            while(count!=0){
                newd = newd * 10 + max;
                count--;
            }
            sum+=newd;
        }
        return sum;
    }
}