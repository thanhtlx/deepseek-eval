class Problem {
    public static ArrayList<Long> makeAPile(long n) {

ArrayList<Long> stones = new ArrayList<>();
stones.add(n);
for (long i = 1; i < n; i++) {
    if (n % 2 == 0) {
        n += 2;
    } else {
        n += 1;
    }
    stones.add(n);
}
return stones;
	}
}