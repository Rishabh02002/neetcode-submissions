class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxf = 0;
        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            hashMap.put(s.charAt(r), hashMap.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, hashMap.get(s.charAt(r)));

            while ((r - l + 1) - maxf > k) {
                hashMap.put(s.charAt(l), hashMap.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
