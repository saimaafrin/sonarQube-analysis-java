import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that returns a pair (a, b), where 'a' is
    // the largest of negative integers, and 'b' is the smallest
    // of positive integers in an array array list.
    // If there is no negative or positive integers, return them as null.
    // Examples:
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(1l))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList())))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)0l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    public static Pair<Optional<Long>, Optional<Long>> largestSmallestIntegers(ArrayList<Long> lst) {

        long largestNeg = -1000000000000L;
        long smallestPos = 1000000000000L;
        Long largestNegObj = new Long(largestNeg);
        Long smallestPosObj = new Long(smallestPos);
        boolean largestNegNull = true;
        boolean smallestPosNull = true;
        for (long elm : lst) {
            if (elm < 0 && elm > largestNeg) {
                largestNeg = elm;
                largestNegNull = false;
            }
            if (elm > 0 && elm < smallestPos) {
                smallestPos = elm;
                smallestPosNull = false;
            }
        }
        if (largestNegNull) {
            largestNegObj = null;
        }
        if (smallestPosNull) {
            smallestPosObj = null;
        }
        return Pair.with(Optional.of(largestNegObj), Optional.of(smallestPosObj));
    }
    public static void main(String[] args) {
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l)))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(1l))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l, (long)0l)))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(1l))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l, (long)6l, (long)-2l)))).equals(Pair.with(-2l, 1l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)4l, (long)5l, (long)3l, (long)6l, (long)2l, (long)7l, (long)-7l)))).equals(Pair.with(-7l, 2l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)8l, (long)4l, (long)9l, (long)2l, (long)5l, (long)-9l)))).equals(Pair.with(-9l, 2l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList()))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)0l)))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-3l, (long)-5l, (long)-6l)))).equals(Pair.with(Optional.of(-1l), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-3l, (long)-5l, (long)-6l, (long)0l)))).equals(Pair.with(Optional.of(-1l), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-6l, (long)-4l, (long)-4l, (long)-3l, (long)1l)))).equals(Pair.with(-3l, 1l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-6l, (long)-4l, (long)-4l, (long)-3l, (long)-100l, (long)1l)))).equals(Pair.with(-3l, 1l)));
    }

}
