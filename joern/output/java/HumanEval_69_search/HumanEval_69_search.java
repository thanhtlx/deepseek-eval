class Problem {
    public static long search(ArrayList<Long> lst) {
    Map<Long, Long> freqMap = lst.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    long result = -1;
    for (Map.Entry<Long, Long> entry : freqMap.entrySet()) {
        if (entry.getKey() > entry.getValue()) {
            result = Math.max(result, entry.getKey());
        }
    }
    return result;
	}
}