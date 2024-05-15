class Problem {
    public static long howManyTimes(String string, String substring) {
        if (string.isEmpty() || substring.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        
        while (index < string.length()) {
            index = string.indexOf(substring, index);
            if (index != -1) {
                count++;
                index++;
            } else {
                break;
            }
        }
        
        return count;
	}
}