import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given a number in decimal form and your task is to convert it to
    // binary format. The function should return a string, with each character representing a binary
    // number. Each character in the string will be '0' or '1'.
    // There will be an extra couple of characters 'db' at the beginning and at the end of the string.
    // The extra characters are there to help with the format.
    // Examples:
    // >>> decimalToBinary((15l))
    // ("db1111db")
    // >>> decimalToBinary((32l))
    // ("db100000db")
    public static String decimalToBinary(long decimal) {

        String binary = Long.toBinaryString(decimal);
        int size = binary.length();
        if (size <= 10)
            binary = "0" + binary;
        if (size <= 9)
            binary = "0" + binary;
        if (size <= 8)
            binary = "0" + binary;
        if (size <= 7)
            binary = "0" + binary;
        if (size <= 6)
            binary = "0" + binary;
        if (size <= 5)
            binary = "0" + binary;
        if (size <= 4)
            binary = "0" + binary;
        if (size <= 3)
            binary = "0" + binary;
        if (size <= 2)
            binary = "0" + binary;
        if (size <= 1)
            binary = "0" + binary;
        binary = "db" + binary + "db";
        return binary;
    }
    public static void main(String[] args) {
    assert(decimalToBinary((0l)).equals(("db0db")));
    assert(decimalToBinary((32l)).equals(("db100000db")));
    assert(decimalToBinary((103l)).equals(("db1100111db")));
    assert(decimalToBinary((15l)).equals(("db1111db")));
    }

}
