class Problem {
    public static boolean isSorted(ArrayList<Long> lst) {
    Set<Long> set = new HashSet<>(lst);
    if (set.size() != lst.size()) {
        return false;
    }
    for (int i = 1; i < lst.size(); i++) {
        if (lst.get(i) < lst.get(i - 1)) {
            return false;
        }
    }
    return true;
	}
}