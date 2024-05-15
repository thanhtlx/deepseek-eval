class Problem {
    public static String makePalindrome(String string) {
        String palindrome = string;
        for (int i = string.length() - 1; i >= 0; i--) {
            if (isPalindrome(string.substring(i))) {
                palindrome += new StringBuilder(string.substring(0, i)).reverse().toString();
                break;
            }
        }
        return palindrome;
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
	}
}