import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Checks if given string is a palindrome
    // >>> isPalindrome((""))
    // (true)
    // >>> isPalindrome(("aba"))
    // (true)
    // >>> isPalindrome(("aaaaa"))
    // (true)
    // >>> isPalindrome(("zbcd"))
    // (false)
    public static boolean isPalindrome(String text) {

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    assert(isPalindrome(("")) == (true));
    assert(isPalindrome(("aba")) == (true));
    assert(isPalindrome(("aaaaa")) == (true));
    assert(isPalindrome(("zbcd")) == (false));
    assert(isPalindrome(("xywyx")) == (true));
    assert(isPalindrome(("xywyz")) == (false));
    assert(isPalindrome(("xywzx")) == (false));
    }

}
