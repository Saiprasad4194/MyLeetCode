class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !used[j]){
                    res.add(nums1[i]);
                    used[j]=true;
                    break;
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}