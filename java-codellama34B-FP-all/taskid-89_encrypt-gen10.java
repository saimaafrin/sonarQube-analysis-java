import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function encrypt that takes a string as an argument and
    // returns a string encrypted with the alphabet being rotated. 
    // The alphabet should be rotated in a manner such that the letters 
    // shift down by two multiplied to two places.
    // For example:
    // >>> encrypt(("hi"))
    // ("lm")
    // >>> encrypt(("asdfghjkl"))
    // ("ewhjklnop")
    // >>> encrypt(("gf"))
    // ("kj")
    // >>> encrypt(("et"))
    // ("ix")
    public static String encrypt(String s) {

        String encryptString = "";
        int alphabet = 0;
        int alphabetRotate = 2;
        for (int i = 0; i < s.length(); i++) {
            alphabet = (int) s.charAt(i);
            if (alphabet >= 65 && alphabet <= 90) {
                alphabet = alphabet + alphabetRotate;
                if (alphabet > 90) {
                    alphabet = (alphabet - 90) + 64;
                }
                encryptString += (char) alphabet;
            } else if (alphabet >= 97 && alphabet <= 122) {
                alphabet = alphabet + alphabetRotate;
                if (alphabet > 122) {
                    alphabet = (alphabet - 122) + 96;
                }
                encryptString += (char) alphabet;
            }
        }
        return encryptString;
    }
    public static void main(String[] args) {
    assert(encrypt(("hi")).equals(("lm")));
    assert(encrypt(("asdfghjkl")).equals(("ewhjklnop")));
    assert(encrypt(("gf")).equals(("kj")));
    assert(encrypt(("et")).equals(("ix")));
    assert(encrypt(("faewfawefaewg")).equals(("jeiajeaijeiak")));
    assert(encrypt(("hellomyfriend")).equals(("lippsqcjvmirh")));
    assert(encrypt(("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh")).equals(("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl")));
    assert(encrypt(("a")).equals(("e")));
    }

}
