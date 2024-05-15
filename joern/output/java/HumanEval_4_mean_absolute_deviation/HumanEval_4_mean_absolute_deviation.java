class Problem {
    public static float meanAbsoluteDeviation(ArrayList<Float> numbers) {
        float mean = (float) numbers.stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
        float sum = 0;
        for (float num : numbers) {
            sum += Math.abs(num - mean);
        }
        return sum / numbers.size();
	}
}