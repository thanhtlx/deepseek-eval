class Problem {
    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        List<String> primeLengthWords = new ArrayList<>();
        for (String word : words) {
            if (isPrime(word.length())) {
                primeLengthWords.add(word);
            }
        }
        return String.join(" ", primeLengthWords);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
}