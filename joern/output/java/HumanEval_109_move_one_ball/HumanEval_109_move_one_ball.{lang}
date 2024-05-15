class Problem {
    public static boolean moveOneBall(ArrayList<Long> arr) {
    if (arr.isEmpty()) {
        return true;
    }
    
    ArrayList<Long> sortedArr = new ArrayList<>(arr);
    Collections.sort(sortedArr);
    
    int n = arr.size();
    for (int i = 0; i < n; i++) {
        if (arr.equals(sortedArr)) {
            return true;
        }
        Long last = arr.get(n - 1);
        arr.remove(n - 1);
        arr.add(0, last);
    }
    
    return false;
	}
}