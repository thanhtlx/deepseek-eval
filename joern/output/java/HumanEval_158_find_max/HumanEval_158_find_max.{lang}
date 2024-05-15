class Problem {
    public static String findMax(ArrayList<String> words) {
        String result = "";
        int maxUniqueChars = 0;
        
        for (String word : words) {
            HashSet<Character> uniqueChars = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                uniqueChars.add(word.charAt(i));
            }
            if (uniqueChars.size() > maxUniqueChars || (uniqueChars.size() == maxUniqueChars && word.compareTo(result) < 0)) {
                maxUniqueChars = uniqueChars.size();
                result = word;
            }
        }
        
        return result;
	}
}