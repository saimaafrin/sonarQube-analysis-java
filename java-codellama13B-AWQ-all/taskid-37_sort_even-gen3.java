import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes an array array list l and returns an array array list l' such that
    // l' is identical to l in the odd indicies, while its values at the even indicies are equal
    // to the values of the even indicies of l, but sorted.
    // >>> sortEven((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
    // >>> sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)6l, (long)5l, (long)4l)))
    public static ArrayList<Long> sortEven(ArrayList<Long> l) {

        ArrayList<Long> l2 = new ArrayList<Long>();
        // This is necessary for the case of an empty list.
        if (l.size() == 0) {
            return l;
        }
        // Create an array, odds, to hold the odd indicies, and evens to hold the even indicies.
        Object[] odds = new Object[l.size() / 2];
        Object[] evens = new Object[l.size() / 2];
        for (int i = 0; i < l.size(); i++) {
            // Add the value to the appropriate array based on its index.
            if (i % 2 == 0) {
                odds[i / 2] = l.get(i);
            } else {
                evens[i / 2] = l.get(i);
            }
        }
        // Sort the even indicies and put them in a list.
        List<Long> sortedEvens = Arrays.stream(evens).map(Object::toString).sorted().map(Long::parseLong).collect(Collectors.toList());
        // Concat the odd indicies and the sorted even indicies, and return them.
        l2.addAll(Arrays.asList(odds));
        l2.addAll(sortedEvens);
        return l2;
    }
    public static void main(String[] args) {
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))));
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)123l, (long)1l, (long)-10l)))).equals((new ArrayList<Long>(Arrays.asList((long)-10l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)5l, (long)0l, (long)9l, (long)1l, (long)123l)))));
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)-12l, (long)4l, (long)23l, (long)2l, (long)3l, (long)11l, (long)12l, (long)-10l)))).equals((new ArrayList<Long>(Arrays.asList((long)-12l, (long)8l, (long)3l, (long)4l, (long)5l, (long)2l, (long)12l, (long)11l, (long)23l, (long)-10l)))));
    }

}
