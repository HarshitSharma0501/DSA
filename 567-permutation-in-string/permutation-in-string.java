class Solution {
    static boolean comparefrq(int[] count1,int[] count2){
        for(int i=0;i<26;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int []count1= new int[26];
        for(int i=0;i<s1.length();i++){
        char ch= s1.charAt(i);
        int index =ch-'a';
        count1[index]++;
        }
        int i=0;
        int[] count2 = new int[26];
        int windowlength = s1.length();
        for(i=0;i<windowlength;i++){
            char ch = s2.charAt(i);
            int index =ch-'a';
            count2[index]++;

        }
        if(comparefrq(count1, count2)==true){
            return true;
        }else{
            while(i<s2.length()){
                char newchar =s2.charAt(i); 
                int newcharindex = newchar-'a';
                count2[newcharindex]++;

                int oldcharindex = i-windowlength;
                char oldchar =s2.charAt(oldcharindex);
                int oldcharfreq = oldchar-'a';
                count2[oldcharfreq]--;

                if(comparefrq(count1,count2)==true){
                    return true;
                   
                }
                 i++;
            }
        }
        return false;
    }
}