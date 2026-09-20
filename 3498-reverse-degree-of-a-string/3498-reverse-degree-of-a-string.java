class Solution {
    public int reverseDegree(String s) {
        int total=0;
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int stringPos=i+1;
            int alphabetVal=('z'-ch)+1; 
            total+=alphabetVal*stringPos;
        }
        return total;
    }
}