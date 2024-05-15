class Problem {
    public static String encode(String message) {
StringBuilder encodedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char encodedChar = Character.toUpperCase(c);
                if (encodedChar == 'A' || encodedChar == 'E' || encodedChar == 'I' || encodedChar == 'O' || encodedChar == 'U') {
                    encodedMessage.append((char) (encodedChar + 2));
                } else {
                    encodedMessage.append(encodedChar);
                }
            } else {
                encodedMessage.append(c);
            }
        }
        return encodedMessage.toString();
	}
}