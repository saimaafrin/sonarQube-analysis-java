import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You have to write a function which validates a given date string and
    // returns true if the date is valid otherwise false.
    // The date is valid if all of the following rules are satisfied:
    // 1. The date string is not empty.
    // 2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
    // 3. The months should not be less than 1 or higher than 12.
    // 4. The date should be in the format: mm-dd-yyyy
    // >>> validDate(("03-11-2000"))
    // (true)
    // >>> validDate(("15-01-2012"))
    // (false)
    // >>> validDate(("04-0-2040"))
    // (false)
    // >>> validDate(("06-04-2020"))
    // (true)
    // >>> validDate(("06/04/2020"))
    // (false)
    public static boolean validDate(String date) {

        String[] s = date.split("-");
        if (s.length != 3) {
            return false;
        }
        int[] dmy = new int[3];
        try {
            for (int i = 0; i < 3; i++) {
                dmy[i] = Integer.parseInt(s[i]);
            }
        } catch (Exception e) {
            return false;
        }
        if (dmy[0] < 1 || dmy[0] > 12 || dmy[1] < 1 || dmy[1] > 31 || dmy[2] < 1) {
            return false;
        }
        if (dmy[0] == 2) {
            if (dmy[2] % 4 == 0) {
                return dmy[1] <= 29;
            }
            return dmy[1] <= 28;
        }
        if (dmy[0] == 4 || dmy[0] == 6 || dmy[0] == 9 || dmy[0] == 11) {
            return dmy[1] <= 30;
        }
        return dmy[1] <= 31;
    }
    public static void main(String[] args) {
    assert(validDate(("03-11-2000")) == (true));
    assert(validDate(("15-01-2012")) == (false));
    assert(validDate(("04-0-2040")) == (false));
    assert(validDate(("06-04-2020")) == (true));
    assert(validDate(("01-01-2007")) == (true));
    assert(validDate(("03-32-2011")) == (false));
    assert(validDate(("")) == (false));
    assert(validDate(("04-31-3000")) == (false));
    assert(validDate(("06-06-2005")) == (true));
    assert(validDate(("21-31-2000")) == (false));
    assert(validDate(("04-12-2003")) == (true));
    assert(validDate(("04122003")) == (false));
    assert(validDate(("20030412")) == (false));
    assert(validDate(("2003-04")) == (false));
    assert(validDate(("2003-04-12")) == (false));
    assert(validDate(("04-2003")) == (false));
    }

}
