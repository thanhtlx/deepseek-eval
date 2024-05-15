class Problem {
    public static Optional<String> stringToMd5(String text) {
        if (text.isEmpty()) {
            return Optional.empty();
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(text.getBytes());
            BigInteger number = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }
            return Optional.of(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return Optional.empty();
	}
}