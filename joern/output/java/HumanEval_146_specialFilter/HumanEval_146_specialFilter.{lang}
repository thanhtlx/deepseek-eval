class Problem {
    public static long specialFilter(ArrayList<Long> nums) {
    return nums.stream()
            .filter(num -> num > 10 && isOddFirstAndLastDigit(num))
            .count();
}

public static boolean isOddFirstAndLastDigit(long num) {
    String numStr = String.valueOf(num);
    int firstDigit = Character.getNumericValue(numStr.charAt(0));
    int lastDigit = Character.getNumericValue(numStr.charAt(numStr.length() - 1));
    return firstDigit % 2 != 0 && lastDigit % 2 != 0;
	}
}