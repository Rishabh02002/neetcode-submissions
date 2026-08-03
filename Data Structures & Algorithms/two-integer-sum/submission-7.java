class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if (n.containsKey(temp)) {
                return new int[] {n.get(temp), i};
            }

            n.put(nums[i], i);
        }
        return new int[] {};
    }
}