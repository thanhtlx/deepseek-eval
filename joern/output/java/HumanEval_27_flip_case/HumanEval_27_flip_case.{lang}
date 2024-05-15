class Problem {
    public static String flipCase(String string) {
        return string.chars()
                     .mapToObj(c -> (char) c)
                     .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                     .map(String::valueOf)
                     .collect(Collectors.joining());
	}
}