class Problem {
    public static ArrayList<String> separateParenGroups(String paren_string) {
        ArrayList<String> groups = new ArrayList<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            sb.append(c);
            if (count == 0) {
                groups.add(sb.toString().replaceAll("\\s+",""));
                sb.setLength(0);
            }
        }
        
        return groups;
	}
}