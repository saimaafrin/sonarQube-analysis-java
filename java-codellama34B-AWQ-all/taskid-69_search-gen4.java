import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a non-empty array list of positive integers. Return the greatest integer that is greater than 
    // zero, and has a frequency greater than or equal to the value of the integer itself. 
    // The frequency of an integer is the number of times it appears in the array list.
    // If no such a value exist, return -1.
    // Examples:
    // >>> search((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)2l, (long)2l, (long)3l, (long)1l))))
    // (2l)
    // >>> search((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)3l, (long)3l, (long)3l, (long)4l, (long)4l, (long)4l))))
    // (3l)
    // >>> search((new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)4l, (long)4l, (long)4l))))
    // (-1l)
    public static long search(ArrayList<Long> lst) {

        // Find the max value in the list
        long maxValue = 0;
        for (long l : lst) {
            if (l > maxValue) {
                maxValue = l;
            }
        }
        if (maxValue == 0) {
            return -1;
        }
        Map<Long, Long> map = new HashMap<Long, Long>();
        for (long l : lst) {
            // If we have already seen this number before, add to it's count
            if (map.containsKey(l)) {
                long currentCount = map.get(l);
                map.put(l, currentCount + 1);
            } else {
                // First time we've seen this number, so set count to 1
                map.put(l, 1l);
            }
        }
        // Check for each key in the map, whether it's count is equal to its value
        for (long l : lst) {
            if (l > 0 && map.get(l) >= l) {
                return l;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    assert(search((new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)5l, (long)5l, (long)1l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)4l, (long)1l, (long)4l, (long)4l)))) == (4l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l)))) == (-1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)8l, (long)8l, (long)8l, (long)8l, (long)8l, (long)8l, (long)8l, (long)8l)))) == (8l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)3l, (long)2l, (long)2l)))) == (2l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)2l, (long)7l, (long)8l, (long)8l, (long)4l, (long)8l, (long)7l, (long)3l, (long)9l, (long)6l, (long)5l, (long)10l, (long)4l, (long)3l, (long)6l, (long)7l, (long)1l, (long)7l, (long)4l, (long)10l, (long)8l, (long)1l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)8l, (long)2l)))) == (2l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)6l, (long)7l, (long)1l, (long)8l, (long)8l, (long)10l, (long)5l, (long)8l, (long)5l, (long)3l, (long)10l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)8l, (long)8l, (long)3l, (long)6l, (long)5l, (long)6l, (long)4l)))) == (-1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)6l, (long)9l, (long)6l, (long)7l, (long)1l, (long)4l, (long)7l, (long)1l, (long)8l, (long)8l, (long)9l, (long)8l, (long)10l, (long)10l, (long)8l, (long)4l, (long)10l, (long)4l, (long)10l, (long)1l, (long)2l, (long)9l, (long)5l, (long)7l, (long)9l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)1l, (long)9l, (long)10l, (long)1l, (long)3l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)6l, (long)9l, (long)7l, (long)5l, (long)8l, (long)7l, (long)5l, (long)3l, (long)7l, (long)5l, (long)10l, (long)10l, (long)3l, (long)6l, (long)10l, (long)2l, (long)8l, (long)6l, (long)5l, (long)4l, (long)9l, (long)5l, (long)3l, (long)10l)))) == (5l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)1l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)8l, (long)8l, (long)10l, (long)6l, (long)4l, (long)3l, (long)5l, (long)8l, (long)2l, (long)4l, (long)2l, (long)8l, (long)4l, (long)6l, (long)10l, (long)4l, (long)2l, (long)1l, (long)10l, (long)2l, (long)1l, (long)1l, (long)5l)))) == (4l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)2l, (long)10l, (long)4l, (long)8l, (long)2l, (long)10l, (long)5l, (long)1l, (long)2l, (long)9l, (long)5l, (long)5l, (long)6l, (long)3l, (long)8l, (long)6l, (long)4l, (long)10l)))) == (2l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)1l, (long)6l, (long)10l, (long)1l, (long)6l, (long)9l, (long)10l, (long)8l, (long)6l, (long)8l, (long)7l, (long)3l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)9l, (long)2l, (long)4l, (long)1l, (long)5l, (long)1l, (long)5l, (long)2l, (long)5l, (long)7l, (long)7l, (long)7l, (long)3l, (long)10l, (long)1l, (long)5l, (long)4l, (long)2l, (long)8l, (long)4l, (long)1l, (long)9l, (long)10l, (long)7l, (long)10l, (long)2l, (long)8l, (long)10l, (long)9l, (long)4l)))) == (4l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)4l, (long)2l, (long)8l, (long)7l, (long)5l, (long)6l, (long)4l, (long)10l, (long)4l, (long)6l, (long)3l, (long)7l, (long)8l, (long)8l, (long)3l, (long)1l, (long)4l, (long)2l, (long)2l, (long)10l, (long)7l)))) == (4l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)9l, (long)8l, (long)6l, (long)10l, (long)2l, (long)6l, (long)10l, (long)2l, (long)7l, (long)8l, (long)10l, (long)3l, (long)8l, (long)2l, (long)6l, (long)2l, (long)3l, (long)1l)))) == (2l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)3l, (long)9l, (long)5l, (long)6l, (long)3l, (long)2l, (long)8l, (long)5l, (long)6l, (long)10l, (long)10l, (long)6l, (long)8l, (long)4l, (long)10l, (long)7l, (long)7l, (long)10l, (long)8l)))) == (-1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)10l)))) == (-1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)9l, (long)7l, (long)7l, (long)2l, (long)4l, (long)7l, (long)2l, (long)10l, (long)9l, (long)7l, (long)5l, (long)7l, (long)2l)))) == (2l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)5l, (long)4l, (long)10l, (long)2l, (long)1l, (long)1l, (long)10l, (long)3l, (long)6l, (long)1l, (long)8l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)7l, (long)9l, (long)9l, (long)9l, (long)3l, (long)4l, (long)1l, (long)5l, (long)9l, (long)1l, (long)2l, (long)1l, (long)1l, (long)10l, (long)7l, (long)5l, (long)6l, (long)7l, (long)6l, (long)7l, (long)7l, (long)6l)))) == (1l));
    assert(search((new ArrayList<Long>(Arrays.asList((long)3l, (long)10l, (long)10l, (long)9l, (long)2l)))) == (-1l));
    }

}
