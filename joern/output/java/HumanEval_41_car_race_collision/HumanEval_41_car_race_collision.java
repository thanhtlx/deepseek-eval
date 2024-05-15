class Problem {
    public static long carRaceCollision(long n) {
int collisions = 0;
for (int i = 1; i <= n; i++) {
    collisions += i;
}
return collisions;
	}
}