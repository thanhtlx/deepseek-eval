class Problem {
    public static boolean checkIfLastCharIsALetter(String txt) {
    if (txt.isEmpty()) {
        return false;
    }
    char lastChar = txt.charAt(txt.length() - 1);
    if (!Character.isLetter(lastChar)) {
        return false;
    }
    if (txt.length() == 1) {
        return true;
    }
    if (Character.isWhitespace(txt.charAt(txt.length() - 2))) {
        return true;
    }
    return false;
	}
}