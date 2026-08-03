class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int ch1[]=new int[26];
        int cha2[]=new int[26];
        for(char ch:s.toCharArray())
        {
            ch1[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            cha2[ch-'a']++;
        }
        for(int i=0;i<ch1.length;i++){
            if(cha2[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
}
