import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string s and a natural number n, you have been tasked to implement 
    // a function that returns an array array list of all words from string s that contain exactly 
    // n consonants, in order these words appear in the string s.
    // If the string s is empty then the function should return an empty array list.
    // Note: you may assume the input string contains only letters and spaces.
    // Examples:
    // >>> selectWords(("Mary had a little lamb"), (4l))
    // (new ArrayList<String>(Arrays.asList((String)"little")))
    // >>> selectWords(("Mary had a little lamb"), (3l))
    // (new ArrayList<String>(Arrays.asList((String)"Mary", (String)"lamb")))
    // >>> selectWords(("simple white space"), (2l))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> selectWords(("Hello world"), (4l))
    // (new ArrayList<String>(Arrays.asList((String)"world")))
    // >>> selectWords(("Uncle sam"), (3l))
    // (new ArrayList<String>(Arrays.asList((String)"Uncle")))
    public static ArrayList<String> selectWords(String s, long n) {

        char[] c = s.toCharArray();
        ArrayList<String> res = new ArrayList<String>();
        int index = 0;
        while (index < c.length) {
            while (index < c.length && c[index] != ' ') {
                index++;
            }
            index++;
            if (index < c.length) {
                while (index < c.length && c[index] == ' ') {
                    index++;
                }
            }
            if (index >= c.length)
                break;
            int count = 0;
            String word = "";
            while (index < c.length && c[index] != ' ') {
                word = word + c[index];
                count += c[index] == 'a' || c[index] == 'e' || c[index] == 'i' || c[index] == 'o' || c[index] == 'u' ? 0 : 1;
                index++;
            }
            if (count == n) {
                res.add(word);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(selectWords(("Mary had a little lamb"), (4l)).equals((new ArrayList<String>(Arrays.asList((String)"little")))));
    assert(selectWords(("Mary had a little lamb"), (3l)).equals((new ArrayList<String>(Arrays.asList((String)"Mary", (String)"lamb")))));
    assert(selectWords(("simple white space"), (2l)).equals((new ArrayList<String>(Arrays.asList()))));
    assert(selectWords(("Hello world"), (4l)).equals((new ArrayList<String>(Arrays.asList((String)"world")))));
    assert(selectWords(("Uncle sam"), (3l)).equals((new ArrayList<String>(Arrays.asList((String)"Uncle")))));
    assert(selectWords((""), (4l)).equals((new ArrayList<String>(Arrays.asList()))));
    assert(selectWords(("a b c d e f"), (1l)).equals((new ArrayList<String>(Arrays.asList((String)"b", (String)"c", (String)"d", (String)"f")))));
    }

}
