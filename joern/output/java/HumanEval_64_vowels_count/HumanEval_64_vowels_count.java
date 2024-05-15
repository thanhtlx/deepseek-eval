class Problem {
    public static long vowelsCount(String s) {
long count = s.toLowerCase().chars().filter(c -> "aeiouy".indexOf(c) != -1).count();
        if (s.toLowerCase().endsWith("y")) {
            count--;
        }
        return count;
	}
}