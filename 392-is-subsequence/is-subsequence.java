class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int n=s.length();
        int m=t.length();

        for(int i=0;i<m&&j<n;i++){
            if(s.charAt(j)==t.charAt(i))
                j++;
            }
        
        return j==n;
    }
}