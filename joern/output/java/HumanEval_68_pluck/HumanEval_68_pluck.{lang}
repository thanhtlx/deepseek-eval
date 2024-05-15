class Problem {
    public static ArrayList<Long> pluck(ArrayList<Long> arr) {

public static ArrayList<Long> pluck(ArrayList<Long> arr) {
    ArrayList<Long> result = new ArrayList<>();
    long smallestValue = Long.MAX_VALUE;
    int smallestIndex = -1;
    for (int i = 0; i < arr.size(); i++) {
        long current = arr.get(i);
        if (current % 2 == 0 && current < smallestValue) {
            smallestValue = current;
            smallestIndex = i;
        }
    }
    if (smallestIndex != -1) {
        result.add(smallestValue);
        result.add((long) smallestIndex);
    }
    return result;
	}
}