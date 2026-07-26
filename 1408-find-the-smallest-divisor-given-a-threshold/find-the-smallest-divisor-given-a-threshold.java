class Solution {
public int sumd(int[] nums,int divisor){
    
        int sum =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum = sum + (int)Math.ceil((double)nums[i] / divisor);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(sumd(nums,mid)<=threshold){
                high = mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return low;
    }
}        