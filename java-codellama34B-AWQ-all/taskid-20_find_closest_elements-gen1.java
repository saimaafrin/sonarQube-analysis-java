import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From a supplied array list of numbers (of length at least two) select and return two that are the closest to each
    // other and return them in order (smaller number, larger number).
    // >>> findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f))))
    // (Pair.with(2.0f, 2.2f))
    // >>> findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f))))
    // (Pair.with(2.0f, 2.0f))
    public static Pair<Float, Float> findClosestElements(ArrayList<Float> numbers) {

        if (numbers.size() == 2)
            return Pair.with(numbers.get(0), numbers.get(1));
        int minDiff = (int)Math.abs((numbers.get(0) - numbers.get(1)));
        int minDiffIdx = 0;
        for (int i = 1; i < numbers.size() - 1; i++) {
            int diff = (int)Math.abs((numbers.get(i) - numbers.get(i + 1)));
            if (diff < minDiff) {
                minDiff = diff;
                minDiffIdx = i;
            }
        }
        return Pair.with(numbers.get(minDiffIdx), numbers.get(minDiffIdx + 1));
    }
    public static void main(String[] args) {
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(3.9f, 4.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f)))).equals((Pair.with(5.0f, 5.9f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(2.0f, 2.2f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f)))).equals((Pair.with(2.0f, 2.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f)))).equals((Pair.with(2.2f, 3.1f))));
    }

}
