class Problem {
    public static ArrayList<Long> uniqueDigits(ArrayList<Long> x) {

        ArrayList<Long> result = new ArrayList<>();
        for (Long num : x) {
            if (hasNoEvenDigit(num)) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }

    private static boolean hasNoEvenDigit(Long num) {
        while (num > 0) {
            if (num % 2 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
	}
}