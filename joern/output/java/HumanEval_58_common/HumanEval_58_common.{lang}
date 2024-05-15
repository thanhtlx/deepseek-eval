class Problem {
    public static ArrayList<Long> common(ArrayList<Long> l1, ArrayList<Long> l2) {
        Set<Long> set1 = new HashSet<>(l1);
        Set<Long> set2 = new HashSet<>(l2);
        set1.retainAll(set2);
        ArrayList<Long> result = new ArrayList<>(set1);
        Collections.sort(result);
        return result;
	}
}