class Problem {
    public static Pair<Optional<Long>, Optional<Long>> largestSmallestIntegers(ArrayList<Long> lst) {
    if (lst.isEmpty()) {
        return Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()));
    }
    
    Optional<Long> maxNegative = lst.stream()
            .filter(num -> num < 0)
            .max(Comparator.naturalOrder());
    
    Optional<Long> minPositive = lst.stream()
            .filter(num -> num > 0)
            .min(Comparator.naturalOrder());
    
    return Pair.with(Optional.ofNullable(maxNegative), Optional.ofNullable(minPositive));
	}
}