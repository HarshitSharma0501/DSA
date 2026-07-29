class Solution {
    int countStudents(int[] nums, int pages){
        int student=1;
        int pageStudents=0;
        for(int i=0;i<nums.length;i++){
            if(pageStudents+nums[i]<=pages){
                pageStudents+=nums[i];
            }else{
                student+=1;
                pageStudents=nums[i];
            }
        }
        return student;
    }
    public int findPages(int[] nums,int n,int m){
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low<=high){
            int mid= low+(high-low)/2;
            int student = countStudents(nums,mid);
            if(student>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
       return findPages(nums,nums.length,k); 
    }
}