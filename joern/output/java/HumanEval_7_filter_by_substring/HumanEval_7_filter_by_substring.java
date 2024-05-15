class Problem {
    public static ArrayList<String> filterBySubstring(ArrayList<String> strings, String substring) {
        return strings.stream()
                      .filter(s -> s.contains(substring))
                      .collect(Collectors.toCollection(ArrayList::new));
	}
}