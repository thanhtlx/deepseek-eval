class Problem {
    public static Pair<Long, Long> evenOddCount(long num) {
        long evenCount = String.valueOf(num).chars().filter(c -> c % 2 == 0).count();
        long oddCount = String.valueOf(num).chars().filter(c -> c % 2 != 0).count();
        return Pair.with(evenCount, oddCount);
	}
}