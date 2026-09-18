class Solution {
    public boolean validDigit(int n, int x) {
        if(n==0){
            return false;
        }
        int temp=n;
        int rem=0;
        boolean con=false;
        while(temp>0){
            rem=temp%10;
            if(rem==x){
                con=true;
            }
            temp/=10;
        }
        if(rem==x){
            return false;
        }
        return con;
    }
}