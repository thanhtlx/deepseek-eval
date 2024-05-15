class Problem {
    public static boolean checkDictCase(HashMap<String,String> dict) {
    if (dict.isEmpty()) {
        return false;
    }
    
    Set<String> keys = dict.keySet();
    boolean allLowerCase = keys.stream().allMatch(key -> key.equals(key.toLowerCase()));
    boolean allUpperCase = keys.stream().allMatch(key -> key.equals(key.toUpperCase()));
    
    return allLowerCase || allUpperCase;
	}
}