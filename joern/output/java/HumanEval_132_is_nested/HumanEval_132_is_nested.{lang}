class Problem {
    public static boolean isNested(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '[') {
                stack.push(c);
            } else if (c == ']' && !stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.size() < string.length() && !stack.isEmpty();
	}
}