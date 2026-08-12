class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int totalWater = 0;
        while (l < r) {
            int diff = r - l;
            totalWater = Math.max(totalWater, Math.min(heights[l], heights[r]) * diff);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return totalWater;
    }
}
