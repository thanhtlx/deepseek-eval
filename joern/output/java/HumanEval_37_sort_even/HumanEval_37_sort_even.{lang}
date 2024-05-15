class Problem {
    public static ArrayList<Long> sortEven(ArrayList<Long> l) {
        List<Long> evenIndices = IntStream.range(0, l.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(l::get)
                .sorted()
                .collect(Collectors.toList());

        List<Long> result = new ArrayList<>(l);
        for (int i = 0, j = 0; i < l.size(); i += 2, j++) {
            result.set(i, evenIndices.get(j));
        }

        return (ArrayList<Long>) result;
	}
}