class Problem {
    public static String solve(String s) {
StringBuilder sb = new StringBuilder();
for (char c : s.toCharArray()) {
    if (Character.isLetter(c)) {
        if (Character.isUpperCase(c)) {
            sb.append(Character.toLowerCase(c));
        } else {
            sb.append(Character.toUpperCase(c));
        }
    } else {
        sb.append(c);
    }
}
if (sb.toString().replaceAll("[^a-zA-Z]", "").isEmpty()) {
    return sb.reverse().toString();
}
return sb.toString();
	}
}