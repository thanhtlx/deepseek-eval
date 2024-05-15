class Problem {
    public static long fizzBuzz(long n) {
        long count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String numStr = String.valueOf(i);
                for (int j = 0; j < numStr.length(); j++) {
                    if (numStr.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
	}
}