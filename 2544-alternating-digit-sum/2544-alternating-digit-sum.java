class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int sum=0;
        int count=0;
        int no=0;
        while(temp>0){
            no=(no*10)+(temp%10);
            temp/=10;
        }
        temp=no;
        while(temp>0){
            count++;
            if(count%2==0){
                sum-=temp%10;
                temp/=10;
            }
            else{
                sum+=temp%10;
                temp/=10;
            }
        }
        return sum;
    }
}