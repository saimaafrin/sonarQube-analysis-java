import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

        if (n == 1) return 2;
        long s1e1 = 1;
        long s1eN = 1;
        for (int i = 2; i < n; i++) {
            long e = s1e1 * 9;
            long nw = s1e1 * 9 + s1eN * 9;
            s1e1 = e;
            s1eN = nw;
        }
        return s1e1 + s1eN;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
