class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maxHours(piles);
        int mid;
        int ans = right;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canEat(piles, mid, h)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public boolean canEat(int[] piles, int k, int h) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += pile / k;
            if (pile % k != 0) {
                totalHours++;
            }
            if (totalHours > h) {
                return false;
            }
        }
        return totalHours <= h;
    }
    public int maxHours(int[] piles) {
        int maxHour = 0;
        for (int pile : piles) {
            maxHour = Math.max(pile, maxHour);
        }
        return maxHour;
    }
}
