import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given the lengths of the three sides of a triangle. Return true if the three
    // sides form a right-angled triangle, false otherwise.
    // A right-angled triangle is a triangle in which one angle is right angle or 
    // 90 degree.
    // Example:
    // >>> rightAngleTriangle((3l), (4l), (5l))
    // (true)
    // >>> rightAngleTriangle((1l), (2l), (3l))
    // (false)
    public static boolean rightAngleTriangle(long a, long b, long c) {

        // check that side length are positive
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }
        // use the triangle inequality
        if (a + b <= c || b + c <= a || a + c <= b) {
            return false;
        }
        // use the law of cosines to check if the angle is right
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    assert(rightAngleTriangle((3l), (4l), (5l)) == (true));
    assert(rightAngleTriangle((1l), (2l), (3l)) == (false));
    assert(rightAngleTriangle((10l), (6l), (8l)) == (true));
    assert(rightAngleTriangle((2l), (2l), (2l)) == (false));
    assert(rightAngleTriangle((7l), (24l), (25l)) == (true));
    assert(rightAngleTriangle((10l), (5l), (7l)) == (false));
    assert(rightAngleTriangle((5l), (12l), (13l)) == (true));
    assert(rightAngleTriangle((15l), (8l), (17l)) == (true));
    assert(rightAngleTriangle((48l), (55l), (73l)) == (true));
    assert(rightAngleTriangle((1l), (1l), (1l)) == (false));
    assert(rightAngleTriangle((2l), (2l), (10l)) == (false));
    }

}
