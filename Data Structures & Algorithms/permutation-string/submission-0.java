class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        // If s1 is longer than s2, s2 cannot contain a permutation of s1
        if (len1 > len2) {
            return false;
        }

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        // 1. Populate the frequency for s1 and the first window of s2
        for (int i = 0; i < len1; i++) {
            s1freq[s1.charAt(i) - 'a']++;
            s2freq[s2.charAt(i) - 'a']++;
        }

        // 2. Check if the initial window matches
        if (checkFreq(s1freq, s2freq)) {
            return true;
        }

        // 3. Slide the window across s2
        for (int i = len1; i < len2; i++) {
            // Add the new character entering the window from the right
            s2freq[s2.charAt(i) - 'a']++;
            // Remove the old character leaving the window from the left
            s2freq[s2.charAt(i - len1) - 'a']--;

            // Check if current window matches s1's frequency profile
            if (checkFreq(s1freq, s2freq)) {
                return true;
            }
        }

        return false;
    }

    // Fixed typo and added private boolean return type
    private boolean checkFreq(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
