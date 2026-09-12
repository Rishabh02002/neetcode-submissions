class Solution {
    public String minWindow(String s, String t) {
        int[] freqS = new int[256];
        int[] freqT = new int[256];
        int left = 0;
        int minStart = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            freqT[t.charAt(i)]++;
        }

        for (int right = 0; right < s.length(); right++) {
            freqS[s.charAt(right)]++;

            while (contains(freqS, freqT)) {
                if (min > right - left + 1) {
                    min = right - left + 1;
                    minStart = left;
                }
                freqS[s.charAt(left++)]--;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + min);
    }
    public boolean contains(int[] freqMapS, int[] freqMapT) {
        for (int i = 0; i < 256; i++) {
            if (freqMapS[i] < freqMapT[i]) {
                return false;
            }
        }
        return true;
    }
}
