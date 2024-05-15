class Problem {
    public static ArrayList<Long> sortThird(ArrayList<Long> l) {
    List<Long> divisibleByThree = l.stream().filter(num -> num % 3 == 0).sorted().collect(Collectors.toList());
    for (int i = 0; i < l.size(); i++) {
        if (l.get(i) % 3 == 0) {
            l.set(i, divisibleByThree.remove(0));
        }
    }
    return l;
	}
}