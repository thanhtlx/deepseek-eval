class Problem {
    public static long largestDivisor(long n) {
return LongStream.range(1, n)
            .filter(i -> n % i == 0)
            .max()
            .orElseThrow(NoSuchElementException::new);
	}
}