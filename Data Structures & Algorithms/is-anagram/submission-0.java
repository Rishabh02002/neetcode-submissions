class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ch = new int[256];
        int[] ch2 = new int[256];

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            ch2[t.charAt(i)]++;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
