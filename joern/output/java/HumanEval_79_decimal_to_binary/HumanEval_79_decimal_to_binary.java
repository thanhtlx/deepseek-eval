class Problem {
    public static String decimalToBinary(long decimal) {

        String binary = Long.toBinaryString(decimal);
        return "db" + binary + "db";
	}
}