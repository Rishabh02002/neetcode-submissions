class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod;
        int[] ret=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            prod=1;
            for(int j=0;j<nums.length;j++)
            {
                if(j==i)
                {
                    continue;
                }
                prod*=nums[j];
                

            }
            ret[i]=prod;
        }
        return ret;
    }
}  
