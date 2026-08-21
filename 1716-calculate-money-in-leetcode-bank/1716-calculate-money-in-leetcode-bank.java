class Solution {
    public int totalMoney(int n) {
        int res=0;
        int count=1;
        int precount=1;
        for(int i=0;i<n;i++){
            res+=precount+count-1;
            if(count%7==0){
                precount++;
                count=1;
            }
            else{
                count++;
            }
        }
        return res;
    }
}