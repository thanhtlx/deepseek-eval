class Problem {
    public static ArrayList<Long> getOddCollatz(long n) {
ArrayList<Long> result = new ArrayList<>();
while (n != 1) {
    if (n % 2 == 0) {
        n = n / 2;
    } else {
        result.add(n);
        n = 3 * n + 1;
    }
}
result.add(1L);
Collections.sort(result);
return result;
	}
}