// Last updated: 9/10/2025, 6:21:59 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            h1.add(nums1[i]);
        }
        HashSet<Integer> h2 = new HashSet<Integer>();
        for(int j = 0; j < nums2.length; j++){
            if(h1.contains(nums2[j])){
                h2.add(nums2[j]);
                h1.remove(nums2[j]);
            }
        }
        int[] res = new int[h2.size()];
        Iterator<Integer> iterator = h2.iterator();

        for (int i = 0; i < res.length; i++) {
            if (iterator.hasNext()) {
                res[i] = iterator.next();
            }
        }
        return res;
    }
}