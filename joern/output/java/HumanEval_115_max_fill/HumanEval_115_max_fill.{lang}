class Problem {
    public static long maxFill(ArrayList<ArrayList<Long>> grid, long capacity) {
        long count = 0;
        for (int i = 0; i < grid.get(0).size(); i++) {
            long sum = 0;
            for (int j = 0; j < grid.size(); j++) {
                sum += grid.get(j).get(i);
            }
            count += (sum + capacity - 1) / capacity;
        }
        return count;
	}
}