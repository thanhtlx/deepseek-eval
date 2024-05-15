class Problem {
    public static boolean iscube(long a) {
    double cubeRoot = Math.cbrt(a);
    return Math.pow(Math.round(cubeRoot), 3) == a;
	}
}