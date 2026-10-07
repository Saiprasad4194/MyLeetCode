class Solution {
    public boolean checkRecord(String s) {
        int latecount=0;
        boolean latecountresult=false;
        int absentcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                absentcount++;
            }
            if(s.charAt(i)=='L'){
                latecount++;
                if(latecount==3){
                    latecountresult=true;
                }
            }
            else{
                latecount=0;
            }
        }
        return absentcount<2&&latecountresult==false;
    }
}