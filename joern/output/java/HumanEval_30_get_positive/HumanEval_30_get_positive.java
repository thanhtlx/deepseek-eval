class Problem {
    public static ArrayList<Long> getPositive(ArrayList<Long> l) {
    return l.stream().filter(num -> num > 0).collect(Collectors.toCollection(ArrayList::new));
	}
}