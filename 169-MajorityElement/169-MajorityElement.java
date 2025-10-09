// Last updated: 10/10/2025, 1:43:51 AM
class Solution {
  public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num : nums){
        map.put(num, map.getOrDefault(num,0)+1);
    }
    int n = nums.length/2;
    // for(Integer key : map.keySet()){
    //     if(map.get(key) > n/2){
    //         return key;
    //     }
    // }

    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(entry.getValue() > n){
            return entry.getKey();
        }
    }

    return 0;
  }
}