class Problem {
    public static long doubleTheDifference(ArrayList<Float> lst) {
long sum = 0;
for (Float num : lst) {
    if (num % 2 != 0 && num > 0 && num % 1 == 0) {
        sum += num * num;
    }
}
return sum * 2;
	}
}