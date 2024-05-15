class Problem {
    public static String fileNameCheck(String file_name) {
    if (file_name == null || file_name.isEmpty()) {
        return "No";
    }
    int countDigits = 0;
    int dotIndex = file_name.indexOf(".");
    if (dotIndex == -1 || dotIndex == 0 || dotIndex == file_name.length() - 1) {
        return "No";
    }
    String beforeDot = file_name.substring(0, dotIndex);
    String afterDot = file_name.substring(dotIndex + 1);
    if (beforeDot.isEmpty() || !Character.isLetter(beforeDot.charAt(0))) {
        return "No";
    }
    for (char c : beforeDot.toCharArray()) {
        if (Character.isDigit(c)) {
            countDigits++;
        }
    }
    if (countDigits > 3) {
        return "No";
    }
    if (!afterDot.equals("txt") && !afterDot.equals("exe") && !afterDot.equals("dll")) {
        return "No";
    }
    return "Yes";
	}
}