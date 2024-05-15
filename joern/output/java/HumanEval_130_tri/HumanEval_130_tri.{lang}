class Problem {
    public static ArrayList<Long> tri(long n) {
ArrayList<Long> result = new ArrayList<>();
result.add(3L);
if (n == 0) {
    return result;
}
result.add(1L);
if (n == 1) {
    return result;
}
result.add(2L);
if (n == 2) {
    return result;
}
for (int i = 3; i <= n; i++) {
    if (i % 2 == 0) {
        result.add(1L + i / 2);
    } else {
        result.add(result.get(i - 1) + result.get(i - 2) + result.get(i - 3));
    }
}
return result;
	}
}