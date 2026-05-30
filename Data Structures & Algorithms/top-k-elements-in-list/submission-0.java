class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] arr = new List[nums.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[entry.getValue()].add(entry.getKey());
        }
        int res[] = new int[k];
        int count = 0;
        for (int i = arr.length - 1; i > 0 && count < k; i--) {
            for (int n : arr[i]) {
                res[count++] = n;
                if (count == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
