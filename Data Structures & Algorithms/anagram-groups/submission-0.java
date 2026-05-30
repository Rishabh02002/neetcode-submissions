class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str: strs)
        {
            int[] num=new int[26];
            for(char ch:str.toCharArray())
            {
                num[ch-'a']++;
            }
            String key=Arrays.toString(num);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
