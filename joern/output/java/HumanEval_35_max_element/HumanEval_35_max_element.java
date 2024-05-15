class Problem {
    public static long maxElement(ArrayList<Long> l) {
    return l.stream().max(Long::compare).get();
	}
}