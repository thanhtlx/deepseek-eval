class Problem {
    public static ArrayList<Long> minPath(ArrayList<ArrayList<Long>> grid, long k) {

public static ArrayList<Long> minPath(ArrayList<ArrayList<Long>> grid, long k) {
    int n = grid.size();
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    ArrayList<Long> result = new ArrayList<>();
    PriorityQueue<Tuple3<Long, Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingLong(Tuple3::getValue0));
    Set<Tuple2<Integer, Integer>> visited = new HashSet<>();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            pq.add(new Tuple3<>(grid.get(i).get(j), i, j));
        }
    }
    while (!pq.isEmpty() && k > 0) {
        Tuple3<Long, Integer, Integer> current = pq.poll();
        result.add(current.getValue0());
        visited.add(new Tuple2<>(current.getValue1(), current.getValue2()));
        k--;
        for (int[] dir : dirs) {
            int newRow = current.getValue1() + dir[0];
            int newCol = current.getValue2() + dir[1];
            if (newRow >= 0 &&
	}
}