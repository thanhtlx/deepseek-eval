    public static String intersection(Pair<Long, Long> interval1, Pair<Long, Long> interval2) {
import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;

class Problem {
    public static String intersection(Pair<Long, Long> interval1, Pair<Long, Long> interval2) {
        long start1 = interval1.getValue0();
        long end1 = interval1.getValue1();
        long start2 = interval2.getValue0();
        long end2 = interval2.getValue1();
        
        long start = Math.max(start1, start2);
        long end = Math.min(end1, end2);
        
        if (start > end) {
            return "NO";
        }
        
        long length = end - start + 1;
        
        if (isPrime(length)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    
    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i
	}
}