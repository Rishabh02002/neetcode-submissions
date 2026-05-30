class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> count = new HashSet<>();
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            count.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!count.contains(nums[i] - 1)) {
                int length = 1;
                while (count.contains(nums[i]+length)) {
                    length++;
                    
                }
                res=Math.max(length,res);
            }
        }
        return res;
    }
}
