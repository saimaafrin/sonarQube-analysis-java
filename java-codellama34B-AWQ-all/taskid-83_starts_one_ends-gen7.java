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

        long count = 0;
        for (long i = 1; i <= n; i++) {
            long val = i;
            while (val > 0) {
                int x = (int) (val % 10);
                val = val / 10;
                if (x == 1) {
                    count++;
                    break;
                }
            }
            val = i;
            while (val > 0) {
                int x = (int) (val % 10);
                val = val / 10;
                if (x == 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
