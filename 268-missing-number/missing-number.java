class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int accsum = (range*(range+1))/2;

        int cursum = 0;

        for(int i=0;i<nums.length;i++){

            cursum = cursum+nums[i];
        }
        int ans = accsum-cursum;

        return ans;
    }
}