class Problem {
    public static long countNums(ArrayList<Long> arr) {
        return arr.stream()
                .filter(num -> {
                    long sum = 0;
                    String numStr = String.valueOf(num);
                    for (int i = 0; i < numStr.length(); i++) {
                        char c = numStr.charAt(i);
                        if (Character.isDigit(c)) {
                            sum += Character.getNumericValue(c);
                        } else if (c == '-') {
                            sum += Character.getNumericValue(numStr.charAt(++i));
                        }
                    }
                    return sum > 0;
                })
                .count();
	}
}