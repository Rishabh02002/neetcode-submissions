class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>res=new HashMap<>();
        for(String str:strs)
        {
            int[] count=new int[26];
            for(char ch:str.toCharArray()){
                count[ch-'a']++;
            }
            String s=Arrays.toString(count);
            res.putIfAbsent(s,new ArrayList<>());
            res.get(s).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
