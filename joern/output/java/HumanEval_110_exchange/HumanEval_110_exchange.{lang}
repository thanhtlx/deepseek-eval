class Problem {
    public static String exchange(ArrayList<Long> lst1, ArrayList<Long> lst2) {
        long sum1 = lst1.stream().mapToLong(Long::longValue).sum();
        long sum2 = lst2.stream().mapToLong(Long::longValue).sum();
        if (sum1 % 2 == 0) {
            return "YES";
        }
        for (Long num1 : lst1) {
            for (Long num2 : lst2) {
                if ((num1 + num2) % 2 == 0) {
                    return "YES";
                }
            }
        }
        return "NO";
	}
}