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

        if (decimal == 0) {
            return "db0db";
        } else if (decimal == 1) {
            return "db1db";
        } else {
            StringBuilder binary = new StringBuilder();
            long remaining = 1l;
            int index = 0;
            while (decimal != 0) {
                index++;
                if (decimal % 2 == 0) {
                    binary.append("0");
                } else {
                    binary.append("1");
                    remaining = decimal % 2;
                }
                decimal = (decimal - remaining) / 2;
            }
            return "db" + binary.reverse().toString() + "db";
        }
    }
    public static void main(String[] args) {
    assert(decimalToBinary((0l)).equals(("db0db")));
    assert(decimalToBinary((32l)).equals(("db100000db")));
    assert(decimalToBinary((103l)).equals(("db1100111db")));
    assert(decimalToBinary((15l)).equals(("db1111db")));
    }

}
