class Problem {
    public static Pair<String, Boolean> reverseDelete(String s, String c) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (c.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        String result = sb.toString();
        String reverse = new StringBuilder(result).reverse().toString();
        return Pair.with(result, result.equals(reverse));
	}
}