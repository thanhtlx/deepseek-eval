import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
	public static boolean correctBracketing(String brackets) {
		for (char c : brackets.toCharArray()) {
			if (c == '<') {
				stack.push(c);
			} else if (c == '>') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}