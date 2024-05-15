class Problem {
    public static ArrayList<Long> removeDuplicates(ArrayList<Long> numbers) {
ArrayList<Long> result = new ArrayList<>();
        Set<Long> set = new HashSet<>();
        for (Long num : numbers) {
            if (!set.contains(num)) {
                result.add(num);
                set.add(num);
            }
        }
        return result;
	}
}