class Problem {
    public static long modp(long n, long p) {
    return BigInteger.valueOf(2).modPow(BigInteger.valueOf(n), BigInteger.valueOf(p)).longValue();
	}
}