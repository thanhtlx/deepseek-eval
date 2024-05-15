class Problem {
    public static long skjkasdkd(ArrayList<Long> lst) {
        long maxPrime = lst.stream()
                .filter(Problem::isPrime)
                .max(Long::compare)
                .orElse(0L);

        return String.valueOf(maxPrime).chars()
                .map(Character::getNumericValue)
                .sum();
    }

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
}