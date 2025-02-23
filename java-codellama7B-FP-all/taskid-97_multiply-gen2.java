import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Complete the function that takes two integers and returns 
    // the product of their unit digits.
    // Assume the input is always valid.
    // Examples:
    // >>> multiply((148l), (412l))
    // (16l)
    // >>> multiply((19l), (28l))
    // (72l)
    // >>> multiply((2020l), (1851l))
    // (0l)
    // >>> multiply((14l), (-15l))
    // (20l)
    public static long multiply(long a, long b) {

        int product = 0;
        int digitsA = 1;
        int digitsB = 1;
        long signA = 1;
        long signB = 1;
        if (a < 0) {
            signA = -1;
            a *= -1;
        }
        if (b < 0) {
            signB = -1;
            b *= -1;
        }
        while (a != 0) {
            product += (a % 10) * (b % 10);
            a /= 10;
            digitsA++;
        }
        while (b != 0) {
            product += (a % 10) * (b % 10);
            b /= 10;
            digitsB++;
        }
        return (signA * signB * product) % 10;
    }
    public static void main(String[] args) {
    assert(multiply((148l), (412l)) == (16l));
    assert(multiply((19l), (28l)) == (72l));
    assert(multiply((2020l), (1851l)) == (0l));
    assert(multiply((14l), (-15l)) == (20l));
    assert(multiply((76l), (67l)) == (42l));
    assert(multiply((17l), (27l)) == (49l));
    assert(multiply((0l), (1l)) == (0l));
    assert(multiply((0l), (0l)) == (0l));
    }

}
