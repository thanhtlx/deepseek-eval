class Problem {
    public static ArrayList<String> sortedListSum(ArrayList<String> lst) {

public static ArrayList<String> sortedListSum(ArrayList<String> lst) {
    lst.removeIf(s -> s.length() % 2 != 0);
    Collections.sort(lst, (a, b) -> {
        if (a.length() == b.length()) {
            return a.compareTo(b);
        } else {
            return a.length() - b.length();
        }
    });
    return lst;
	}
}