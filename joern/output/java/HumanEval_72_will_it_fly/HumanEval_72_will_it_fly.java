class Problem {
    public static boolean willItFly(ArrayList<Long> q, long w) {
    List<Long> reversed = new ArrayList<>(q);
    Collections.reverse(reversed);
    return q.equals(reversed) && q.stream().mapToLong(Long::longValue).sum() <= w;
	}
}