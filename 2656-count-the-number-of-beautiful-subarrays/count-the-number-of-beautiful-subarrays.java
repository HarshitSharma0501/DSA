class Solution {
    public long beautifulSubarrays(int[] nums) {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);

        int xor = 0;
        long count = 0;

        for (int num : nums) {
            xor ^= num;

            if (map.containsKey(xor)) {
                count += map.get(xor);
            }

            map.put(xor, map.getOrDefault(xor, 0L) + 1);
        }

        return count;
    }
}