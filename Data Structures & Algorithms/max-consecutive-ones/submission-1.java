class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                n++;
            }else{
                n=0;
            }
            max=Math.max(n,max);

        }
        return max;
    }
}