class Problem {
    public static long fib(long n) {
    if (n <= 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
	}
}