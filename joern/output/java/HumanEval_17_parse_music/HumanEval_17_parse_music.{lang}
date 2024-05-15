class Problem {
    public static ArrayList<Long> parseMusic(String music_string) {

        ArrayList<Long> beats = new ArrayList<>();
        String[] notes = music_string.split(" ");
        for (String note : notes) {
            if (note.equals("o")) {
                beats.add(4L);
            } else if (note.equals("o|")) {
                beats.add(2L);
            } else if (note.equals(".|")) {
                beats.add(1L);
            }
        }
        return beats;
	}
}