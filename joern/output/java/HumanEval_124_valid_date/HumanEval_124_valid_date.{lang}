class Problem {
    public static boolean validDate(String date) {
    if (date.isEmpty()) {
        return false;
    }
    
    String[] parts = date.split("-");
    if (parts.length != 3) {
        return false;
    }
    
    int month = Integer.parseInt(parts[0]);
    int day = Integer.parseInt(parts[1]);
    int year = Integer.parseInt(parts[2]);
    
    if (month < 1 || month > 12) {
        return false;
    }
    
    if (day < 1 || day > 31) {
        if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
            return false;
        } else if (month == 2) {
            if (year % 4 == 0) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
    
    return true;
	}
}