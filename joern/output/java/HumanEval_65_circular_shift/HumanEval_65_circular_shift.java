class Problem {
    public static String circularShift(long x, long shift) {
StringBuilder sb = new StringBuilder();
String numStr = Long.toString(x);
int len = numStr.length();
shift = shift % len;
if (shift == 0) {
    return numStr;
}
sb.append(numStr.substring((int) (len - shift)));
sb.append(numStr.substring(0, (int) (len - shift)));
return sb.toString();
	}
}