class Problem {
    public static long digits(long n) {
    String numStr = String.valueOf(n);
    long product = 1;
    for (int i = 0; i < numStr.length(); i++) {
        int digit = Character.getNumericValue(numStr.charAt(i));
        if (digit % 2 != 0) {
            product *= digit;
        }
    }
    return product == 1 ? 0 : product;
	}
}