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
        // count for numbers that start with 1
        for (long i = 1; i <= 9; i++) {
            long num = (long) Math.pow(10, n - 1) + i;
            if (num % 11 == 0) {
                count++;
            }
        }
        // count for numbers that end with 1
        for (long i = 1; i <= 9; i++) {
            long num = i * (long) Math.pow(10, n - 1);
            if (num % 11 == 0) {
                count++;
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
