class Problem {
    public static long sumSquares(ArrayList<Long> lst) {
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                lst.set(i, lst.get(i) * lst.get(i));
            } else if (i % 4 == 0) {
                lst.set(i, lst.get(i) * lst.get(i) * lst.get(i));
            }
            sum += lst.get(i);
        }
        return sum;
	}
}