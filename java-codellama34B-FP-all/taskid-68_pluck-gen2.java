import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // "Given an array array list representing a branch of a tree that has non-negative integer nodes
    // your task is to pluck one of the nodes and return it.
    // The plucked node should be the node with the smallest even value.
    // If multiple nodes with the same smallest even value are found return the node that has smallest index.
    // The plucked node should be returned in an array array list, [ smalest_value, its index ],
    // If there are no even values or the given array array list is empty, return [].
    // Example 1:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
    // Explanation: 2 has the smallest even value, and 2 has the smallest index.
    // Example 2:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
    // Explanation: 2 has the smallest even value, and 2 has the smallest index.
    // Example 3:
    // >>> pluck((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    // Example 4:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)5l, (long)0l, (long)3l, (long)0l, (long)4l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))
    // Explanation: 0 is the smallest value, but  there are two zeros,
    // so we will choose the first zero, which has the smallest index.
    // Constraints:
    // * 1 <= nodes.length <= 10000
    // * 0 <= node.value
    public static ArrayList<Long> pluck(ArrayList<Long> arr) {

        // if (arr == null || arr.isEmpty()) {
        //     return new ArrayList<Long>(Arrays.asList());
        // }
        // ArrayList<Long> arr_out = new ArrayList<Long>();
        // long val_even = Long.MAX_VALUE;
        // int idx = -1;
        // int arr_len = arr.size();
        // for (int i = 0; i < arr_len; i++) {
        //     if (arr.get(i) % 2 == 0 && arr.get(i) <= val_even) {
        //         val_even = arr.get(i);
        //         idx = i;
        //     }
        // }
        // if (idx == -1) {
        //     return new ArrayList<Long>(Arrays.asList());
        // }
        // arr_out.add(val_even);
        // arr_out.add((long)idx);
        // return arr_out;

        if (arr == null || arr.isEmpty()) {
            return new ArrayList<Long>(Arrays.asList());
        }
        Long val_even = arr.stream().filter(v -> v % 2 == 0).min(Comparator.comparing(Long::longValue)).orElse(Long.MAX_VALUE);
        if (val_even == Long.MAX_VALUE) {
            return new ArrayList<Long>(Arrays.asList());
        }
        int idx = arr.indexOf(val_even);
        ArrayList<Long> arr_out = new ArrayList<Long>(Arrays.asList(val_even, (long)idx));
        return arr_out;
    }
    public static void main(String[] args) {
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))));
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))));
    assert(pluck((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)5l, (long)0l, (long)3l, (long)0l, (long)4l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))));
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)0l, (long)5l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)3l)))));
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)5l, (long)4l, (long)8l, (long)4l, (long)8l)))).equals((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l)))));
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)7l, (long)6l, (long)7l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)6l, (long)1l)))));
    assert(pluck((new ArrayList<Long>(Arrays.asList((long)7l, (long)9l, (long)7l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
