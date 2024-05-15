class Problem {
    public static Pair<Float, Float> findClosestElements(ArrayList<Float> numbers) {

        Collections.sort(numbers);
        float minDiff = Float.MAX_VALUE;
        Pair<Float, Float> result = null;
        for (int i = 0; i < numbers.size() - 1; i++) {
            float diff = numbers.get(i + 1) - numbers.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                result = Pair.with(numbers.get(i), numbers.get(i + 1));
            }
        }
        return result;
	}
}