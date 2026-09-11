class Solution {
    public boolean isFascinating(int n) {
        if(n%10==0){
            return false;
        }
        String s=Integer.toString(n)+Integer.toString(n*2)+Integer.toString(n*3);
         if(s.length()!=9){
            return false;
        }
        int merged=Integer.parseInt(s);
        int con=0,temp=merged;
        int[]arr=new int[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp % 10;
            temp /= 10;
        }
        for(int i = 0; i < arr.length; i++){
            con = 0;
            for(int j = 1; j < 10; j++){
                if(arr[i] == j){
                    con = 1;
                }
            }
            if(con == 0){
                return false;
            }
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}