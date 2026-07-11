class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
              map.put(i, map.getOrDefault(i, 0) + 1);
        
        }
        for(int i: map.keySet()){
              if(map.get(i)>n/3){
              ans.add(i);
        }
              }
        
        return ans;
    }
}