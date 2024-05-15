class Problem {
    public static ArrayList<String> byLength(ArrayList<Long> arr) {
    List<String> names = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
    ArrayList<String> result = arr.stream()
            .filter(num -> num >= 1 && num <= 9)
            .sorted()
            .map(num -> names.get(num.intValue() - 1))
            .collect(Collectors.toCollection(ArrayList::new));
    Collections.reverse(result);
    return result;
	}
}