import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // triples_sum_to_zero takes an array array list of integers as an input.
    // it returns true if there are three distinct elements in the array list that
    // sum to zero, and false otherwise.
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)0l))))
    // (false)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)-2l, (long)1l))))
    // (true)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)7l))))
    // (false)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)-5l, (long)3l, (long)9l, (long)7l))))
    // (true)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l))))
    // (false)
    public static boolean triplesSumToZero(ArrayList<Long> l) {

        // Write your code here.
        Set<Long> set = new HashSet<Long>();
        for (long num : l) {
            if (set.contains(-num)) return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)0l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)-1l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)-2l, (long)1l)))) == (true));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)7l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)5l, (long)7l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)-5l, (long)3l, (long)9l, (long)7l)))) == (true));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)-100l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)100l, (long)3l, (long)5l, (long)-100l)))) == (false));
    }

}
