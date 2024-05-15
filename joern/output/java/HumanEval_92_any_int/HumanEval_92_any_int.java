class Problem {
    public static boolean anyInt(float x, float y, float z) {
    return (int)x == (int)y + (int)z || (int)y == (int)x + (int)z || (int)z == (int)x + (int)y;
	}
}