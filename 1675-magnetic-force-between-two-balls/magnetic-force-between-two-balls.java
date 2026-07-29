class Solution {
    boolean canMakePlace(int[] position , int dist,int balls){
        int cntBalls =1; int last = position[0];
        for(int i=0;i<position.length;i++){
            if(position[i]-last>=dist){
                cntBalls++;
                last=position[i];

            }
            if(cntBalls>=balls){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low =1; int high = position[n-1]-position[0];
        while(low<=high){
        int mid = low+(high-low)/2;
        if(canMakePlace(position,mid,m)== true){
            low = mid+1;
        } else{
            high=mid-1;
        }
    }
        return high;
    }
}