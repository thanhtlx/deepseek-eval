class Problem {
    public static long getMaxTriples(long n) {
List<Long> a = new ArrayList<>();
for (long i = 1; i <= n; i++) {
    a.add(i * i - i + 1);
}
int count = 0;
for (int i = 0; i < a.size(); i++) {
    for (int j = i + 1; j < a.size(); j++) {
        for (int k = j + 1; k < a.size(); k++) {
            if ((a.get(i) + a.get(j) + a.get(k)) % 3 == 0) {
                count++;
            }
        }
    }
}
return count;
	}
}