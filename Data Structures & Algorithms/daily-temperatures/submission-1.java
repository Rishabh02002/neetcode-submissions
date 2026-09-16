class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> maxEle = new Stack<>();
        int[] result = new int[temperatures.length];
        maxEle.push(temperatures.length - 1);
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!maxEle.isEmpty() && temperatures[i] >= temperatures[maxEle.peek()]) {
                maxEle.pop();
            }
            if (maxEle.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = maxEle.peek() - i;
            }
            maxEle.push(i);
        }
        return result;
    }
}
