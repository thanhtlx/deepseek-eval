class Problem {
    public static boolean isMultiplyPrime(long a) {
        if (a < 30) {
            return false;
        }
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0 && isPrime(i)) {
                long remaining = a / i;
                if (isPrime(remaining)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
	}
}