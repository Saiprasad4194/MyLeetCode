class Solution {
    public int digitFrequencyScore(int n) {
        int freq=0;
        int temp=n;
        while(temp>0){
            freq+=temp%10;
            temp/=10;
        }
        return freq;
    }
}