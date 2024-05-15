class Problem {
    public static long isBored(String S) {
        String[] sentences = S.split("[.!?]");
        long count = 0;
        for (String sentence : sentences) {
            if (sentence.trim().startsWith("I")) {
                count++;
            }
        }
        return count;
	}
}