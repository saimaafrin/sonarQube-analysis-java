import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true is array list elements are monotonically increasing or decreasing.
    // >>> monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)20l))))
    // (true)
    // >>> monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))))
    // (false)
    // >>> monotonic((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)0l, (long)-10l))))
    // (true)
    public static boolean monotonic(ArrayList<Long> l) {

        if (l.size() <= 1)
            return true;
        Long prev = l.get(0);
        boolean is_increasing = false;
        boolean is_decreasing = false;
        for (int i = 1; i < l.size(); i++) {
            Long cur = l.get(i);
            if (cur > prev)
                is_increasing = true;
            if (cur < prev)
                is_decreasing = true;
            if (is_increasing && is_decreasing)
                return false;
            prev = cur;
        }
        return true;
    }
    public static void main(String[] args) {
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)10l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)20l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l)))) == (false));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)0l, (long)-10l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)1l, (long)0l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)5l, (long)60l)))) == (false));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)60l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)9l, (long)9l, (long)9l, (long)9l)))) == (true));
    }

}
