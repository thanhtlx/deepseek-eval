class Problem {
    public static ArrayList<Pair<Long, Long>> getRow(ArrayList<ArrayList<Long>> lst, long x) {
        ArrayList<Pair<Long, Long>> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            ArrayList<Long> row = lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j) == x) {
                    result.add(Pair.with((long) i, (long) j));
                }
            }
        }
        result.sort(Comparator.comparing(Pair::getValue0).thenComparing(Comparator.comparing(Pair::getValue1).reversed()));
        return result;
	}
}