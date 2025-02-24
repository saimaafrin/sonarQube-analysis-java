import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a positive integer n. You have to create an integer array array list a of length n.
    // For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
    // Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
    // and a[i] + a[j] + a[k] is a multiple of 3.
    // Example :
    // >>> getMaxTriples((5l))
    // (1l)
    // Explanation: 
    // a = [1, 3, 7, 13, 21]
    // The only valid triple is (1, 7, 13).
    public static long getMaxTriples(long n) {

        List<Long> a = new ArrayList<Long>();
        for (int i = 1; i <= n; i++) {
            a.add((long) (i * i - i + 1));
        }
        long max = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                for (int k = j + 1; k < a.size(); k++) {
                    long sum = a.get(i) + a.get(j) + a.get(k);
                    if (sum % 3 == 0 && i < j && j < k) {
                        max++;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
    assert(getMaxTriples((5l)) == (1l));
    assert(getMaxTriples((6l)) == (4l));
    assert(getMaxTriples((10l)) == (36l));
    assert(getMaxTriples((100l)) == (53361l));
    }

}
