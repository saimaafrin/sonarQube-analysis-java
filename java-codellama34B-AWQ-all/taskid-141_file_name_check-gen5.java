import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which takes a string representing a file's name, and returns
    // 'Yes' if the the file's name is valid, and returns 'No' otherwise.
    // A file's name is considered to be valid if and only if all the following conditions 
    // are met:
    // - There should not be more than three digits ('0'-'9') in the file's name.
    // - The file's name contains exactly one dot '.'
    // - The substring before the dot should not be empty, and it starts with a letter from 
    // the latin alphapet ('a'-'z' and 'A'-'Z').
    // - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
    // Examples:
    // >>> fileNameCheck(("example.txt"))
    // ("Yes")
    // >>> fileNameCheck(("1example.dll"))
    // ("No")
    public static String fileNameCheck(String file_name) {

        // 1. Check the number of digits
        // 2. Check for .
        // 3. Check for prefix, suffix
        // 4. Return the result
        int number_of_digits = 0;
        int dot_position = -1;
        int dot_count = 0;
        boolean is_file_name_valid = false;
        int character_position = -1;
        for (char c : file_name.toCharArray()) {
            character_position += 1;
            if (c >= '0' && c <= '9') {
                number_of_digits += 1;
            }
            if (c == '.') {
                dot_count += 1;
                dot_position = character_position;
            }
        }
        if (number_of_digits > 3) {
            is_file_name_valid = false;
        } else if (dot_count != 1) {
            is_file_name_valid = false;
        } else {
            String prefix = file_name.substring(0, dot_position);
            String suffix = file_name.substring(dot_position + 1, file_name.length());
            if (prefix.length() == 0) {
                is_file_name_valid = false;
            } else if (suffix.equals("txt") || suffix.equals("exe") || suffix.equals("dll")) {
                is_file_name_valid = true;
            } else {
                is_file_name_valid = false;
            }
        }
        if (is_file_name_valid) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static void main(String[] args) {
    assert(fileNameCheck(("example.txt")).equals(("Yes")));
    assert(fileNameCheck(("1example.dll")).equals(("No")));
    assert(fileNameCheck(("s1sdf3.asd")).equals(("No")));
    assert(fileNameCheck(("K.dll")).equals(("Yes")));
    assert(fileNameCheck(("MY16FILE3.exe")).equals(("Yes")));
    assert(fileNameCheck(("His12FILE94.exe")).equals(("No")));
    assert(fileNameCheck(("_Y.txt")).equals(("No")));
    assert(fileNameCheck(("?aREYA.exe")).equals(("No")));
    assert(fileNameCheck(("/this_is_valid.dll")).equals(("No")));
    assert(fileNameCheck(("this_is_valid.wow")).equals(("No")));
    assert(fileNameCheck(("this_is_valid.txt")).equals(("Yes")));
    assert(fileNameCheck(("this_is_valid.txtexe")).equals(("No")));
    assert(fileNameCheck(("#this2_i4s_5valid.ten")).equals(("No")));
    assert(fileNameCheck(("@this1_is6_valid.exe")).equals(("No")));
    assert(fileNameCheck(("this_is_12valid.6exe4.txt")).equals(("No")));
    assert(fileNameCheck(("all.exe.txt")).equals(("No")));
    assert(fileNameCheck(("I563_No.exe")).equals(("Yes")));
    assert(fileNameCheck(("Is3youfault.txt")).equals(("Yes")));
    assert(fileNameCheck(("no_one#knows.dll")).equals(("Yes")));
    assert(fileNameCheck(("1I563_Yes3.exe")).equals(("No")));
    assert(fileNameCheck(("I563_Yes3.txtt")).equals(("No")));
    assert(fileNameCheck(("final..txt")).equals(("No")));
    assert(fileNameCheck(("final132")).equals(("No")));
    assert(fileNameCheck(("_f4indsartal132.")).equals(("No")));
    assert(fileNameCheck((".txt")).equals(("No")));
    assert(fileNameCheck(("s.")).equals(("No")));
    }

}
