class Problem {
    public static ArrayList<String> wordsString(String s) {
        String[] words = s.split("[,\\s]+");
        return new ArrayList<String>(Arrays.asList(words));
	}
}