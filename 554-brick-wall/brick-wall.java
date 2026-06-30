class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(List<Integer>a1:wall){
            int sum =0;
            for(int i=0;i<a1.size()-1;i++){
                sum+=a1.get(i);
                map.put(sum,map.getOrDefault(sum,0)+1);

            }
        }
        int max=0;
        for(int key:map.keySet()){
            max=Math.max(max,map.get(key));

        }
        return wall.size()-max;
    }
}