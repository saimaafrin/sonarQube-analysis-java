import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string s.
    // if s[i] is a letter, reverse its case from lower to upper or vise versa, 
    // otherwise keep it as it is.
    // If the string contains no letters, reverse the string.
    // The function should return the resulted string.
    // Examples
    // >>> solve(("1234"))
    // ("4321")
    // >>> solve(("ab"))
    // ("AB")
    // >>> solve(("#a@C"))
    // ("#A@c")
    public static String solve(String s) {

        boolean hasLetter = false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                hasLetter = true;
                if (Character.isLowerCase(ch)) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            } else {
                result.append(ch);
            }
        }
        if (hasLetter) {
            return result.toString();
        } else {
            return new StringBuilder(s).reverse().toString();
        }
    }
    public static void main(String[] args) {
    assert(solve(("AsDf")).equals(("aSdF")));
    assert(solve(("1234")).equals(("4321")));
    assert(solve(("ab")).equals(("AB")));
    assert(solve(("#a@C")).equals(("#A@c")));
    assert(solve(("#AsdfW^45")).equals(("#aSDFw^45")));
    assert(solve(("#6@2")).equals(("2@6#")));
    assert(solve(("#$a^D")).equals(("#$A^d")));
    assert(solve(("#ccc")).equals(("#CCC")));
    }

}
