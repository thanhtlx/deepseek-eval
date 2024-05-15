class Problem {
    public static long sumSquares(ArrayList<Float> lst) {
    return lst.stream()
              .mapToInt(num -> (int) Math.ceil(num))
              .mapToLong(num -> num * num)
              .sum();
	}
}