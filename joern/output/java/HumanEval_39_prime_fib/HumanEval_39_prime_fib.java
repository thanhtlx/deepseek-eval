    public static long primeFib(long n) {
import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;

class Problem {
    public static long primeFib(long n) {
        long a = 2, b = 3, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            while (!isPrime(b)) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return b;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
	}
}