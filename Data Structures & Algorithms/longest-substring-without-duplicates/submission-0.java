class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chSet=new HashSet<>();

        int l=0;
        int r=0;
        int max=0;
        while(r<s.length())
        {
            while(chSet.contains(s.charAt(r))){
                
                chSet.remove(s.charAt(l));
                l++;
            }
            chSet.add(s.charAt(r));
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
