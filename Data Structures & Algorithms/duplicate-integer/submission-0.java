class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicate=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            duplicate.add(nums[i]);
        }
        if(duplicate.size()==nums.length)
        {
            return false;
        }
        return true;

    }
}