import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given number n, find the largest number that divides n evenly, smaller than n
    // >>> largestDivisor((15l))
    // (5l)
    public static long largestDivisor(long n) {

        // if n == 1, no divisor
        if(n == 1) {
            return n;
        }
        // start from n - 1, and loop backwards till we find the largest divisor
        for (long i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        // if we reach here, it means no divisor was found. Return 1
        return 1;
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
