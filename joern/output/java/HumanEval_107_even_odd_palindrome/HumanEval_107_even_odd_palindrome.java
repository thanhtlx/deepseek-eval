class Problem {
    public static Pair<Long, Long> evenOddPalindrome(long n) {
List<Long> palindromes = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                palindromes.add(i);
            }
        }
        long evenCount = palindromes.stream().filter(num -> num % 2 == 0).count();
        long oddCount = palindromes.size() - evenCount;
        return Pair.with(evenCount, oddCount);
    }

    private static boolean isPalindrome(long num) {
        String str = String.valueOf(num);
        return str.equals(new StringBuilder(str).reverse().toString());
	}
}