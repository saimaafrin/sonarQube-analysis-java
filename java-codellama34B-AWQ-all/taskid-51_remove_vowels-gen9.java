import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // remove_vowels is a function that takes string and returns string without vowels.
    // >>> removeVowels((""))
    // ("")
    // >>> removeVowels(("abcdef"))
    // ("bcdf")
    // >>> removeVowels(("aaaaa"))
    // ("")
    // >>> removeVowels(("aaBAA"))
    // ("B")
    // >>> removeVowels(("zbcd"))
    // ("zbcd")
    public static String removeVowels(String text) {

        String vowels = "aeiou";
        String textWithoutVowels = "";
        for (char c : text.toCharArray()) {
            if (!vowels.contains(String.valueOf(c).toLowerCase())) {
                textWithoutVowels += c;
            }
        }
        return textWithoutVowels;
    }
    public static void main(String[] args) {
    assert(removeVowels(("")).equals(("")));
    assert(removeVowels(("abcdef\nghijklm")).equals(("bcdf\nghjklm")));
    assert(removeVowels(("fedcba")).equals(("fdcb")));
    assert(removeVowels(("eeeee")).equals(("")));
    assert(removeVowels(("acBAA")).equals(("cB")));
    assert(removeVowels(("EcBOO")).equals(("cB")));
    assert(removeVowels(("ybcd")).equals(("ybcd")));
    }

}
