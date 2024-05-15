class Problem {
    public static long countDistinctCharacters(String string) {
    return string.toLowerCase().chars().distinct().count();
	}
}