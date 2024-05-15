class Problem {
    public static long fruitDistribution(String s, long n) {
        String[] parts = s.split(" ");
        int apples = Integer.parseInt(parts[0]);
        int oranges = Integer.parseInt(parts[3]);
        int totalFruits = apples + oranges;
        return n - totalFruits;
	}
}