class Problem {
    public static String getClosestVowel(String word) {
        String vowels = "aeiouAEIOU";
        int n = word.length();
        for (int i = n - 2; i > 0; i--) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                if ("aeiouAEIOU".indexOf(word.charAt(i - 1)) == -1 && "aeiouAEIOU".indexOf(word.charAt(i + 1)) == -1) {
                    return String.valueOf(word.charAt(i));
                }
            }
        }
        return "";
	}
}