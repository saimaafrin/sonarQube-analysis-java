import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement a function that takes an non-negative integer and returns an array array list of the first n
    // integers that are prime numbers and less than n.
    // for example:
    // >>> countUpTo((5l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))
    // >>> countUpTo((11l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l)))
    // >>> countUpTo((0l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> countUpTo((20l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l, (long)19l)))
    // >>> countUpTo((1l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> countUpTo((18l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l)))
    public static ArrayList<Long> countUpTo(long n) {

        ArrayList<Long> arr = new ArrayList<Long>();
        if (n < 2) return arr;
        // Arrays.asList(2l, 3l, 5l, 7l, 11l, 13l, 17l, 19l, 23l, 29l, 31l, 37l, 41l, 43l, 47l, 53l, 59l, 61l, 67l, 71l, 73l, 79l, 83l, 89l, 97l);
        arr.add((long)2);
        arr.add((long)3);
        for (long i = 5; i < n; i++) {
            boolean isPrime = true;
            for (int j = 0; j < arr.size(); j++) {
                if (i % arr.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
    assert(countUpTo((5l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))));
    assert(countUpTo((6l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l)))));
    assert(countUpTo((7l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l)))));
    assert(countUpTo((10l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l)))));
    assert(countUpTo((0l)).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(countUpTo((22l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l, (long)19l)))));
    assert(countUpTo((1l)).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(countUpTo((18l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l)))));
    assert(countUpTo((47l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l, (long)19l, (long)23l, (long)29l, (long)31l, (long)37l, (long)41l, (long)43l)))));
    assert(countUpTo((101l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l, (long)19l, (long)23l, (long)29l, (long)31l, (long)37l, (long)41l, (long)43l, (long)47l, (long)53l, (long)59l, (long)61l, (long)67l, (long)71l, (long)73l, (long)79l, (long)83l, (long)89l, (long)97l)))));
    }

}
