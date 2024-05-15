class Problem {
    public static long doAlgebra(ArrayList<String> op, ArrayList<Long> operand) {

        long result = operand.get(0);
        for (int i = 0; i < op.size(); i++) {
            switch (op.get(i)) {
                case "+":
                    result += operand.get(i + 1);
                    break;
                case "-":
                    result -= operand.get(i + 1);
                    break;
                case "*":
                    result *= operand.get(i + 1);
                    break;
                case "//":
                    result /= operand.get(i + 1);
                    break;
                case "**":
                    result = (long) Math.pow(result, operand.get(i + 1));
                    break;
            }
        }
        return result;
	}
}