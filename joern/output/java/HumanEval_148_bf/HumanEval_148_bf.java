class Problem {
    public static ArrayList<String> bf(String planet1, String planet2) {
    ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    int index1 = planets.indexOf(planet1);
    int index2 = planets.indexOf(planet2);
    
    if (index1 == -1 || index2 == -1) {
        return new ArrayList<>();
    }
    
    int start = Math.min(index1, index2);
    int end = Math.max(index1, index2);
    
    List<String> result = planets.subList(start + 1, end);
    return new ArrayList<>(result);
	}
}