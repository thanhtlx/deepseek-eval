class Problem {
    public static Optional<Long> nextSmallest(ArrayList<Long> lst) {
        if (lst.size() < 2) {
            return Optional.empty();
        }
        TreeSet<Long> set = new TreeSet<>(lst);
        set.remove(set.first());
        if (set.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(set.first());
	}
}