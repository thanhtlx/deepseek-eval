class Problem {
    public static HashMap<String,Long> histogram(String test) {
HashMap<String, Long> map = new HashMap<>();
        String[] letters = test.split(" ");
        for (String letter : letters) {
            map.put(letter, map.getOrDefault(letter, 0L) + 1);
        }
        long maxCount = map.values().stream().max(Long::compare).orElse(0L);
        HashMap<String, Long> result = new HashMap<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
	}
}