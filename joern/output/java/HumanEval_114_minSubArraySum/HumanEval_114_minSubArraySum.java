class Problem {
    public static long minSubArraySum(ArrayList<Long> nums) {
        long minSum = Long.MAX_VALUE;
        long currentSum = 0;
        for (long num : nums) {
            currentSum = Math.min(num, currentSum + num);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
	}
}