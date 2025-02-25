import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given two positive integers a and b, return the even digits between a
    // and b, in ascending order.
    // For example:
    // >>> generateIntegers((2l), (8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))
    // >>> generateIntegers((8l), (2l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))
    // >>> generateIntegers((10l), (14l))
    // (new ArrayList<Long>(Arrays.asList()))
    public static ArrayList<Long> generateIntegers(long a, long b) {

        ArrayList<Long> answer = new ArrayList<Long>();
        if (a < b) {
            for (long i = a; i <= b; i++) {
                String s = String.valueOf(i);
                for (int j = 0; j < s.length(); j++) {
                    if (Long.parseLong(s.substring(j, j + 1)) % 2 == 0) {
                        answer.add(i);
                        break;
                    }
                }
            }
        } else {
            for (long i = b; i <= a; i++) {
                String s = String.valueOf(i);
                for (int j = 0; j < s.length(); j++) {
                    if (Long.parseLong(s.substring(j, j + 1)) % 2 == 0) {
                        answer.add(i);
                        break;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
    assert(generateIntegers((2l), (10l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((10l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((132l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((17l), (89l)).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
