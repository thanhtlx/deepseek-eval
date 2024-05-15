class Problem {
    public static long smallestChange(ArrayList<Long> arr) {
    int n = arr.size();
    long[][] dp = new long[n][n];
    for (int len = 2; len <= n; len++) {
        for (int i = 0; i < n - len + 1; i++) {
            int j = i + len - 1;
            if (arr.get(i).equals(arr.get(j))) {
                dp[i][j] = dp[i + 1][j - 1];
            } else {
                dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
            }
        }
    }
    return dp[0][n - 1];
	}
}