class Problem {
    public static String changeBase(long x, long base) {
StringBuilder sb = new StringBuilder();
while (x > 0) {
    sb.insert(0, x % base);
    x /= base;
}
return sb.toString();
	}
}