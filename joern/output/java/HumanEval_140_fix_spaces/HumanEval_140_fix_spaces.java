class Problem {
    public static String fixSpaces(String text) {
        return text.replaceAll("\\s{2,}", "-").replaceAll("\\s", "_");
	}
}