class Solution {
    public int commonFactors(int a, int b) {
        int count=0,temp;
        if(a>b){
            temp=b;
        }
        else{
            temp=a;
        }
        for(int i=1;i<=temp;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }
}