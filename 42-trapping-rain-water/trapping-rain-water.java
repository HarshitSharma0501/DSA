class Solution {
    public int trap(int[] height) {
      Stack<Integer> st = new Stack<>();
        int water = 0;
      for(int i=0; i<height.length; i++){
        while(!st.isEmpty() && height[i]>height[st.peek()]){
            int rm=i;
            int curr=st.pop();
            if(st.isEmpty()){
                break;
            }
            int lm =st.peek();
            int width = rm-lm-1;
            water+=(Math.min(height[lm],height[rm])-height[curr])*width;
        }
        st.push(i);
      }
      return water;
    }
}