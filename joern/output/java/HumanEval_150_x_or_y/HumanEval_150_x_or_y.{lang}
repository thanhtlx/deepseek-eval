class Problem {
    public static long xOrY(long n, long x, long y) {
if (isPrime(n)) {
        return x;
    } else {
        return y;
    }
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