class Problem {
    public static ArrayList<Float> rescaleToUnit(ArrayList<Float> numbers) {
    float min = Collections.min(numbers);
    float max = Collections.max(numbers);
    ArrayList<Float> rescaled = new ArrayList<>();
    for (float num : numbers) {
        float newValue = (num - min) / (max - min);
        rescaled.add(newValue);
    }
    return rescaled;
	}
}