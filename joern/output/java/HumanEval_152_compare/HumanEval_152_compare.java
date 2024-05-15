class Problem {
    public static ArrayList<Long> compare(ArrayList<Long> game, ArrayList<Long> guess) {

public static ArrayList<Long> compare(ArrayList<Long> game, ArrayList<Long> guess) {
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 0; i < game.size(); i++) {
            result.add(Math.abs(game.get(i) - guess.get(i)));
        }
        return result;
	}
}