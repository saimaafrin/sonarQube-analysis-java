import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of prime factors of given integer in the order from smallest to largest.
    // Each of the factors should be array listed number of times corresponding to how many times it appeares in factorization.
    // Input number should be equal to the product of all factors
    // >>> factorize((8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))
    // >>> factorize((25l))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l)))
    // >>> factorize((70l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)7l)))
    public static ArrayList<Long> factorize(long n) {

        ArrayList<Long> res = new ArrayList<>();
        while (n % 2l == 0l) {
            res.add(2l);
            n /= 2l;
        }
        for (long i = 3l; i <= Math.sqrt(n); i += 2l) {
            while (n % i == 0l) {
                res.add(i);
                n /= i;
            }
        }
        if (n > 1l) {
            res.add(n);
        }
        return res;
    }
    public static void main(String[] args) {
    assert(factorize((2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l)))));
    assert(factorize((4l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l)))));
    assert(factorize((8l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))));
    assert(factorize((57l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)19l)))));
    assert(factorize((3249l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)19l, (long)19l)))));
    assert(factorize((185193l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)3l, (long)19l, (long)19l, (long)19l)))));
    assert(factorize((20577l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)19l, (long)19l, (long)19l)))));
    assert(factorize((18l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)3l)))));
    }

}
