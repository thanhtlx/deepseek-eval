class Problem {
    public static ArrayList<String> selectWords(String s, long n) {
ArrayList<String> selectWords(String s, long n) {
        ArrayList<String> result = new ArrayList<>();
        if (s.isEmpty()) {
            return result;
        }
        
        String[] words = s.split(" ");
        for (String word : words) {
            long consonantCount = word.chars().filter(c -> "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1).count();
            if (consonantCount == n) {
                result.add(word);
            }
        }
        
        return result;
	}
}