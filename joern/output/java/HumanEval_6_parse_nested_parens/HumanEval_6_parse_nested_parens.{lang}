class Problem {
    public static ArrayList<Long> parseNestedParens(String paren_string) {
        ArrayList<Long> result = new ArrayList<>();
        String[] groups = paren_string.split(" ");
        for (String group : groups) {
            long maxDepth = 0;
            long currentDepth = 0;
            for (int i = 0; i < group.length(); i++) {
                if (group.charAt(i) == '(') {
                    currentDepth++;
                    maxDepth = Math.max(maxDepth, currentDepth);
                } else if (group.charAt(i) == ')') {
                    currentDepth--;
                }
            }
            result.add(maxDepth);
        }
        return result;
	}
}