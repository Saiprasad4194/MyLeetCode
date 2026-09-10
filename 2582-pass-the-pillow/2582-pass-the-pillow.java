class Solution {
    public int passThePillow(int n, int time) {
        int temp_time=0,temp_n=1;
        int k=0;
        while(temp_time!=time){

            if (k==0){
                temp_n++;
                temp_time++;
                if (temp_n==n) {
                    k=1;
                }
            } 
            else{
                temp_n--;
                temp_time++;
                if (temp_n==1) {
                    k=0;
                }
            }
        }
        return temp_n;
    }
}