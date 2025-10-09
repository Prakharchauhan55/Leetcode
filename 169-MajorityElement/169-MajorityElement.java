// Last updated: 10/10/2025, 1:42:32 AM
class Solution {
  public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num : nums){
        map.put(num, map.getOrDefault(num,0)+1);
    }
    int n = nums.length;
    // for(Integer key : map.keySet()){
    //     if(map.get(key) > n/2){
    //         return key;
    //     }
    // }

    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(entry.getValue() > n/2){
            return entry.getKey();
        }
    }

    return -1;
  }
}