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

        // Write your code here
        // For a given number n, find the largest number that divides n evenly, smaller than n
        // >>> largestDivisor((15l))
        // (5l)
        long i = 2;
        long largest = n;
        if(n > 0){
            for(i = 2; i < n; i++){
                if(n % i == 0 && i > largest){
                    largest = i;
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
