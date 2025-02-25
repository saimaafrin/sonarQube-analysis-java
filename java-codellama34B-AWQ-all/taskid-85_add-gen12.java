import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a non-empty array list of integers lst. add the even elements that are at odd indices..
    // Examples:
    // >>> add((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)6l, (long)7l))))
    // (2l)
    public static long add(ArrayList<Long> lst) {

        return lst.stream().filter((e) -> e % 2 == 0).filter((e) -> lst.indexOf(e) % 2 == 1).reduce(0l, (a, b) -> a + b);
    }
    public static void main(String[] args) {
    assert(add((new ArrayList<Long>(Arrays.asList((long)4l, (long)88l)))) == (88l));
    assert(add((new ArrayList<Long>(Arrays.asList((long)4l, (long)5l, (long)6l, (long)7l, (long)2l, (long)122l)))) == (122l));
    assert(add((new ArrayList<Long>(Arrays.asList((long)4l, (long)0l, (long)6l, (long)7l)))) == (0l));
    assert(add((new ArrayList<Long>(Arrays.asList((long)4l, (long)4l, (long)6l, (long)8l)))) == (12l));
    }

}
