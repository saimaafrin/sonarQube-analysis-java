import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes a message, and encodes in such a 
    // way that it swaps case of all letters, replaces all vowels in 
    // the message with the letter that appears 2 places ahead of that 
    // vowel in the english alphabet. 
    // Assume only letters. 
    // Examples:
    // >>> encode(("test"))
    // ("TGST")
    // >>> encode(("This is a message"))
    // ("tHKS KS C MGSSCGG")
    public static String encode(String message) {

        message = message.toLowerCase();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";
        String msg = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (vowels.indexOf(c) == -1) {
                msg += letters.charAt((letters.indexOf(c) - 9) % 26);
            } else {
                msg += letters.charAt((letters.indexOf(c) + 2) % 26);
            }
        }
        return msg.toUpperCase();
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
