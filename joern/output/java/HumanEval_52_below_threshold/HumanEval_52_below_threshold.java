class Problem {
    public static boolean belowThreshold(ArrayList<Long> l, long t) {
    return l.stream().allMatch(num -> num < t);
	}
}