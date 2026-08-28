class Solution {
    public int smallestEvenMultiple(int n) {
        int num=0;
        boolean res=true;
        for(int i=n;res;i++){
            if(i%2==0&&i%n==0){
                num=i;
                res=false;
            }
        }
        return num;
    }
}