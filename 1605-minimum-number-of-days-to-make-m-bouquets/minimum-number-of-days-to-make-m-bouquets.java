class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }

        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();

        while(low<=high){
            int mid=low+(high-low)/2;

            if(canMake(bloomDay,m,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;
    }

    public boolean canMake(int[] bloomDay,int m,int k,int day){
        int flowers=0,bouquets=0;

        for(int bloom:bloomDay){
            if(bloom<=day){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers=0;
                }
            }else{
                flowers=0;
            }
        }

        return bouquets>=m;
    }
}