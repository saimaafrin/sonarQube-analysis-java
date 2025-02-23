import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    // separate those group into separate strings and return the array list of those.
    // Separate groups are balanced (each open brace is properly closed) and not nested within each other
    // Ignore any spaces in the input string.
    // >>> separateParenGroups(("( ) (( )) (( )( ))"))
    // (new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))
    public static ArrayList<String> separateParenGroups(String paren_string) {

        ArrayList<String> groups = new ArrayList<>();
        int i = 0;
        while (i < paren_string.length()) {
            int paren_idx = i;
            int start_idx = paren_idx;
            while (paren_idx < paren_string.length() && paren_string.charAt(paren_idx) != ')') {
                paren_idx += 1;
            }
            if (paren_idx < paren_string.length()) {
                paren_idx += 1;
            }
            while (paren_idx < paren_string.length() && paren_string.charAt(paren_idx) == ')') {
                paren_idx += 1;
            }
            int end_idx = paren_idx;
            String group = paren_string.substring(start_idx, end_idx);
            groups.add(group);
            i = end_idx;
        }
        return groups;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
