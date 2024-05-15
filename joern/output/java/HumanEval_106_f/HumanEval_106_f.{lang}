class Problem {
    public static ArrayList<Long> f(long n) {
    ArrayList<Long> result = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            result.add(factorial);
        } else {
            long sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            result.add(sum);
        }
    }
    return result;
	}
}