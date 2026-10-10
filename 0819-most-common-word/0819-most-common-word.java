class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll("[!?',;.]", " ");
        String[] words = paragraph.split("\\s+");
        int[] count=new int[words.length];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<banned.length;j++){
                    if (words[i].equals(banned[j])) {
                    count[i] = -1;
                    break;
                }
            }
                 if(count[i]!=-1){
                    count[i]=1;
                    for(int k=i+1;k<words.length;k++){
                        if(words[i].equals(words[k])){
                            count[i]++;
                        }
                    }
                 }
        }
        int maxIndex=0;
        
        for (int i=1;i<count.length;i++) {
            if (count[i]>0 && (maxIndex==-1 || count[i]>count[maxIndex])) {
                maxIndex=i;
            }
        }
        return words[maxIndex];
    }
}