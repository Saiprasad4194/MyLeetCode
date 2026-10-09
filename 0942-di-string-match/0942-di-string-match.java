class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int low=0;
        int high=n;
        int[] arr=new int[n+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=low;
                low++;
            }
            if(s.charAt(i)=='D'){
                arr[i]=high;
                high--;
            }
        }
        arr[n]=low;
        return arr;
    }
}