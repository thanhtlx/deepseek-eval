class Problem {
    public static ArrayList<Long> unique(ArrayList<Long> l) {
        Set<Long> set = new HashSet<>(l);
        ArrayList<Long> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
	}
}