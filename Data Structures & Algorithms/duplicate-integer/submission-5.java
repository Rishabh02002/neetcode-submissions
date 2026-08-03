class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hashSet.add(nums[i]);
        }
        return hashSet.size()!=nums.length;
    }
}