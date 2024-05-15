class Problem {
    public static long countUpper(String s) {
        long count = IntStream.range(0, s.length())
                .filter(i -> i % 2 == 0)
                .filter(i -> "AEIOU".indexOf(s.charAt(i)) != -1)
                .count();
        return count;
	}
}