import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function vowels_count which takes a string representing
    // a word as input and returns the number of vowels in the string.
    // Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
    // vowel, but only when it is at the end of the given word.
    // Example:
    // >>> vowelsCount(("abcde"))
    // (2l)
    // >>> vowelsCount(("ACEDY"))
    // (3l)
    public static long vowelsCount(String s) {

        int count = 0;
        if (s == null || s.length() == 0) {
            return count;
        }
        char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < s.length(); i++) {
            if (Arrays.asList(vowels).contains(s.charAt(i))) {
                count++;
            }
            if (s.charAt(i) == 'y' && i == s.length() - 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    assert(vowelsCount(("abcde")) == (2l));
    assert(vowelsCount(("Alone")) == (3l));
    assert(vowelsCount(("key")) == (2l));
    assert(vowelsCount(("bye")) == (1l));
    assert(vowelsCount(("keY")) == (2l));
    assert(vowelsCount(("bYe")) == (1l));
    assert(vowelsCount(("ACEDY")) == (3l));
    }

}
