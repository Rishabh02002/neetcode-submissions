class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=1){
                len=0;
            }
            else{
                len++;
            }
            res=Math.max(res,len);
        }
        return res;
    }
}