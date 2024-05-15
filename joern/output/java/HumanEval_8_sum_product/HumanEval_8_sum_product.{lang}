class Problem {
    public static Pair<Long, Long> sumProduct(ArrayList<Long> numbers) {

        Long sum = numbers.stream().reduce(0L, Long::sum);
        Long product = numbers.stream().reduce(1L, (a, b) -> a * b);
        return Pair.with(sum, product);
	}
}