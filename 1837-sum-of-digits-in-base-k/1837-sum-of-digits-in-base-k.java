class Solution {
    public int sumBase(int n, int k) {
        int res=0;
        while (n>0){
            int rem = n % k;
            res += rem;
            n = n / k;
        }
        return res;
    }
}