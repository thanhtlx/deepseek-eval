class Problem {
    public static ArrayList<String> totalMatch(ArrayList<String> lst1, ArrayList<String> lst2) {

        int totalChars1 = lst1.stream().mapToInt(String::length).sum();
        int totalChars2 = lst2.stream().mapToInt(String::length).sum();
        return totalChars1 < totalChars2 ? lst1 : lst2;
	}
}