class Problem {
    public static boolean isPalindrome(String text) {
    String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reversedText = new StringBuilder(cleanText).reverse().toString();
    return cleanText.equals(reversedText);
	}
}