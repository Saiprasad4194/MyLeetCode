class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int temp;
        int add;
        int max=0;
        int []arr=new int[46];
        for(int i=lowLimit;i<=highLimit;i++){
            temp=i;
            add=0;
            while(temp>0){
                add+=temp%10;
                temp=temp/10;
            }
            arr[add]++;
            max=Math.max(max,arr[add]);
        }
        return max;
    }
}