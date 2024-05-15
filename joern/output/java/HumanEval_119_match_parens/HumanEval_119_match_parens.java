class Problem {
    public static String matchParens(ArrayList<String> lst) {
        Stack<Character> stack = new Stack<>();
        for (String str : lst) {
            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return "No";
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "Yes" : "No";
	}
}