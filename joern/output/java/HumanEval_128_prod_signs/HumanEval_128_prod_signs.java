class Problem {
    public static Optional<Long> prodSigns(ArrayList<Long> arr) {
        if (arr.isEmpty()) {
            return Optional.empty();
        }
        long product = 1;
        for (Long num : arr) {
            product *= num == 0 ? 0 : num / Math.abs(num);
        }
        long sum = arr.stream().mapToLong(Math::abs).sum();
        return Optional.of(product * sum);
	}
}