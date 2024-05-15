class Problem {
    public static ArrayList<Long> sortArray(ArrayList<Long> array) {

        ArrayList<Long> sortedArray = new ArrayList<>(array);
        int sum = (int) (sortedArray.get(0) + sortedArray.get(sortedArray.size() - 1));
        if (sum % 2 == 0) {
            Collections.sort(sortedArray, Collections.reverseOrder());
        } else {
            Collections.sort(sortedArray);
        }
        return sortedArray;
	}
}