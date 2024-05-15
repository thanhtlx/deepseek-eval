class Problem {
    public static String sortNumbers(String numbers) {
        String[] numberWords = numbers.split(" ");
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        
        List<String> sortedNumbers = Arrays.stream(numberWords)
                .sorted(Comparator.comparingInt(numberMap::get))
                .collect(Collectors.toList());
        
        return String.join(" ", sortedNumbers);
	}
}