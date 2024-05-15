class Problem {
    public static long add(ArrayList<Long> lst) {
        return IntStream.range(0, lst.size())
                        .filter(i -> i % 2 != 0 && lst.get(i) % 2 == 0)
                        .mapToLong(lst::get)
                        .sum();
	}
}