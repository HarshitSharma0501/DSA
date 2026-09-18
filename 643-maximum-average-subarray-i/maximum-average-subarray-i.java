class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
        for(int j=i;j<i+k;j++){
            sum+=nums[j];
           
           
        }
        
            maxsum=Math.max(maxsum,sum); 
        }
        return (double)maxsum/k;
    }
}