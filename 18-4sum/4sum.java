class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
       List<List<Integer>> temp = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                int k = j+1;
                int l = n-1;
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(k<l){
                    ArrayList<Integer> ans = new ArrayList<>();
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        ans.add(nums[l]);
                        k++;
                        l--;

                        temp.add(ans);
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;

                    }
                    else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return temp;
    }
}