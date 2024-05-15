class Problem {
    public static String encrypt(String s) {
        return s.chars()
                .mapToObj(c -> (char) ((c - 'a' + 2 * 2) % 26 + 'a'))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
	}
}