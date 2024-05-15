class Problem {
    public static Optional<String> longest(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return Optional.empty();
        }
        
        return strings.stream()
                .max(Comparator.comparing(String::length));
	}
}