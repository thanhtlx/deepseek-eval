class Problem {
    public static ArrayList<Long> orderByPoints(ArrayList<Long> nums) {
        Collections.sort(nums, (a, b) -> {
            int sumA = String.valueOf(Math.abs(a)).chars().map(Character::getNumericValue).sum();
            int sumB = String.valueOf(Math.abs(b)).chars().map(Character::getNumericValue).sum();
            if (sumA == sumB) {
                return nums.indexOf(a) - nums.indexOf(b);
            }
            return sumA - sumB;
        });
        return nums;
	}
}