class Problem {
    public static ArrayList<String> allPrefixes(String string) {
ArrayList<String> allPrefixes = new ArrayList<>();
for (int i = 1; i <= string.length(); i++) {
    allPrefixes.add(string.substring(0, i));
}
return allPrefixes;
	}
}