class Problem {
    public static ArrayList<Long> sortArray(ArrayList<Long> arr) {
        Collections.sort(arr, (a, b) -> {
            int countA = Long.bitCount(Math.abs(a));
            int countB = Long.bitCount(Math.abs(b));
            if (countA == countB) {
                return Long.compare(a, b);
            }
            return Integer.compare(countA, countB);
        });
        return arr;
	}
}