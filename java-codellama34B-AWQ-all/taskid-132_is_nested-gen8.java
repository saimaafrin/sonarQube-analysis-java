import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes a string as input which contains only square brackets.
    // The function should return true if and only if there is a valid subsequence of brackets 
    // where at least one bracket in the subsequence is nested.
    // >>> isNested(("[[]]"))
    // (true)
    // >>> isNested(("[]]]]]]][[[[[]"))
    // (false)
    // >>> isNested(("[][]"))
    // (false)
    // >>> isNested(("[]"))
    // (false)
    // >>> isNested(("[[][]]"))
    // (true)
    // >>> isNested(("[[]][["))
    // (true)
    public static boolean isNested(String string) {

        Stack<Character> brackets = new Stack<Character>();
        int i = 0;
        for (; i < string.length(); i++) {
            if (string.charAt(i) == '[') {
                brackets.push(string.charAt(i));
            } else {
                break;
            }
        }
        if (i == string.length()) {
            return false;
        }
        for (; i < string.length(); i++) {
            if (string.charAt(i) == ']') {
                if (brackets.isEmpty()) {
                    return false;
                } else {
                    brackets.pop();
                }
            } else {
                brackets.push(string.charAt(i));
            }
        }
        return brackets.isEmpty();
    }
    public static void main(String[] args) {
    assert(isNested(("[[]]")) == (true));
    assert(isNested(("[]]]]]]][[[[[]")) == (false));
    assert(isNested(("[][]")) == (false));
    assert(isNested(("[]")) == (false));
    assert(isNested(("[[[[]]]]")) == (true));
    assert(isNested(("[]]]]]]]]]]")) == (false));
    assert(isNested(("[][][[]]")) == (true));
    assert(isNested(("[[]")) == (false));
    assert(isNested(("[]]")) == (false));
    assert(isNested(("[[]][[")) == (true));
    assert(isNested(("[[][]]")) == (true));
    assert(isNested(("")) == (false));
    assert(isNested(("[[[[[[[[")) == (false));
    assert(isNested(("]]]]]]]]")) == (false));
    }

}
