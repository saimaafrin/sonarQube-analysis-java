import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string representing musical notes in a special ASCII format.
    // Your task is to parse this string and return array list of integers corresponding to how many beats does each
    // not last.
    // Here is a legend:
    // 'o' - whole note, lasts four beats
    // 'o|' - half note, lasts two beats
    // '.|' - quater note, lasts one beat
    // >>> parseMusic(("o o| .| o| o| .| .| .| .| o o"))
    // (new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)1l, (long)2l, (long)2l, (long)1l, (long)1l, (long)1l, (long)1l, (long)4l, (long)4l)))
    public static ArrayList<Long> parseMusic(String music_string) {

        ArrayList<Long> parsed = new ArrayList<Long>();
        for (int i = 0; i < music_string.length(); i++) {
            switch (music_string.charAt(i)) {
                case 'o': {
                    if (i < music_string.length() - 1 && music_string.charAt(i + 1) == '|') {
                        parsed.add((long) 2);
                        i++;
                    } else {
                        parsed.add((long) 4);
                    }
                    break;
                }
                case '.': {
                    parsed.add((long) 1);
                    break;
                }
            }
        }
        return parsed;
    }
    public static void main(String[] args) {
    assert(parseMusic(("")).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(parseMusic(("o o o o")).equals((new ArrayList<Long>(Arrays.asList((long)4l, (long)4l, (long)4l, (long)4l)))));
    assert(parseMusic((".| .| .| .|")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)))));
    assert(parseMusic(("o| o| .| .| o o o o")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)1l, (long)1l, (long)4l, (long)4l, (long)4l, (long)4l)))));
    assert(parseMusic(("o| .| o| .| o o| o o|")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)2l, (long)1l, (long)4l, (long)2l, (long)4l, (long)2l)))));
    }

}
