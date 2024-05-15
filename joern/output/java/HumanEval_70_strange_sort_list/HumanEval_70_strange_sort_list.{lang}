class Problem {
    public static ArrayList<Long> strangeSortList(ArrayList<Long> lst) {
    ArrayList<Long> result = new ArrayList<>();
    Collections.sort(lst);
    int left = 0;
    int right = lst.size() - 1;
    while (left <= right) {
        if (left == right) {
            result.add(lst.get(left));
        } else {
            result.add(lst.get(left));
            result.add(lst.get(right));
        }
        left++;
        right--;
    }
    return result;
	}
}