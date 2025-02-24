import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true if a given number is prime, and false otherwise.
    // >>> isPrime((6l))
    // (false)
    // >>> isPrime((101l))
    // (true)
    // >>> isPrime((11l))
    // (true)
    // >>> isPrime((13441l))
    // (true)
    // >>> isPrime((61l))
    // (true)
    // >>> isPrime((4l))
    // (false)
    // >>> isPrime((1l))
    // (false)
    public static boolean isPrime(long n) {

        // If `n` is less than or equal to 1, it is not prime.
        if (n <= 1) {
            return false;
        }
        // A list of numbers to check for compositeness.
        List<Long> alist = new ArrayList<Long>();
        // Loop through the numbers up to and including the square root of `n`.
        for (long i = 2l; i*i <= n; i++) {
            // Add the current number to the list of numbers to check for compositeness.
            alist.add(i);
        }
        // Check to see if `n` is divisible by any of the numbers.
        for (long i : alist) {
            if (n % i == 0) {
                return false;
            }
        }
        // If `n` has reached this point and has not been found to be divisible by any of the numbers, it is prime.
        return true;
    }
    public static void main(String[] args) {
    assert(isPrime((6l)) == (false));
    assert(isPrime((101l)) == (true));
    assert(isPrime((11l)) == (true));
    assert(isPrime((13441l)) == (true));
    assert(isPrime((61l)) == (true));
    assert(isPrime((4l)) == (false));
    assert(isPrime((1l)) == (false));
    assert(isPrime((5l)) == (true));
    assert(isPrime((11l)) == (true));
    assert(isPrime((17l)) == (true));
    assert(isPrime((85l)) == (false));
    assert(isPrime((77l)) == (false));
    assert(isPrime((255379l)) == (false));
    }

}
