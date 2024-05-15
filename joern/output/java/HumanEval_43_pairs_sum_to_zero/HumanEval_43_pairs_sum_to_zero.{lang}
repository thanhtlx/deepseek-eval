class Problem {
    public static boolean pairsSumToZero(ArrayList<Long> l) {
    Set<Long> set = new HashSet<>();
    for (Long num : l) {
        if (set.contains(-num)) {
            return true;
        }
        set.add(num);
    }
    return false;
	}
}