class Problem {
    public static String StrongestExtension(String class_name, ArrayList<String> extensions) {
        String strongestExtension = "";
        int maxStrength = Integer.MIN_VALUE;
        
        for (String extension : extensions) {
            int capCount = 0;
            int smCount = 0;
            for (char c : extension.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    capCount++;
                } else if (Character.isLowerCase(c)) {
                    smCount++;
                }
            }
            int strength = capCount - smCount;
            if (strength > maxStrength || (strength == maxStrength && extensions.indexOf(extension) < extensions.indexOf(strongestExtension))) {
                maxStrength = strength;
                strongestExtension = extension;
            }
        }
        
        return class_name + "." + strongestExtension;
	}
}