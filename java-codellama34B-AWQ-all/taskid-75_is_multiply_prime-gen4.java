import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the given number is the multiplication of 3 prime numbers
    // and false otherwise.
    // Knowing that (a) is less then 100. 
    // Example:
    // >>> isMultiplyPrime((30l))
    // (true)
    // 30 = 2 * 3 * 5
    public static boolean isMultiplyPrime(long a) {

        // If the number can be divided by 2, then it is not prime
        if (a % 2 == 0) {
            return false;
        }
        // We iterate over all odd numbers until the square root
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            int count = 0;
            while (a % i == 0) {
                count++;
                a /= i;
            }
            // If the number can be divided by odd number more than once, then it is not prime
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    assert(isMultiplyPrime((5l)) == (false));
    assert(isMultiplyPrime((30l)) == (true));
    assert(isMultiplyPrime((8l)) == (true));
    assert(isMultiplyPrime((10l)) == (false));
    assert(isMultiplyPrime((125l)) == (true));
    assert(isMultiplyPrime((105l)) == (true));
    assert(isMultiplyPrime((126l)) == (false));
    assert(isMultiplyPrime((729l)) == (false));
    assert(isMultiplyPrime((891l)) == (false));
    assert(isMultiplyPrime((1001l)) == (true));
    }

}
