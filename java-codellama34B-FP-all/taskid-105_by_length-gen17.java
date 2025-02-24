import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of integers, sort the integers that are between 1 and 9 inclusive,
    // reverse the resulting array array list, and then replace each digit by its corresponding name from
    // "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".
    // For example:
    // >>> byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l))))
    // (new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))
    // If the array array list is empty, return an empty array array list:
    // >>> byLength((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<String>(Arrays.asList()))
    // If the array array list has any strange number ignore it:
    // >>> byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l))))
    // (new ArrayList<String>(Arrays.asList((String)"One")))
    public static ArrayList<String> byLength(ArrayList<Long> arr) {

        ArrayList<String> arrList = new ArrayList<String>();
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) >= 1 && arr.get(i) <= 9){
                arrList.add(arr.get(i).toString());
            }
        }
        for(int i = 0; i < arrList.size(); i++){
            switch(arrList.get(i)){
                case "1":
                    arrList.set(i, "One");
                    break;
                case "2":
                    arrList.set(i, "Two");
                    break;
                case "3":
                    arrList.set(i, "Three");
                    break;
                case "4":
                    arrList.set(i, "Four");
                    break;
                case "5":
                    arrList.set(i, "Five");
                    break;
                case "6":
                    arrList.set(i, "Six");
                    break;
                case "7":
                    arrList.set(i, "Seven");
                    break;
                case "8":
                    arrList.set(i, "Eight");
                    break;
                case "9":
                    arrList.set(i, "Nine");
                    break;
            }
        }
        Collections.reverse(arrList);
        return arrList;
    }
    public static void main(String[] args) {
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l)))).equals((new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l)))).equals((new ArrayList<String>(Arrays.asList((String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)3l, (long)2l)))).equals((new ArrayList<String>(Arrays.asList((String)"Three", (String)"Two", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)9l, (long)4l, (long)8l)))).equals((new ArrayList<String>(Arrays.asList((String)"Nine", (String)"Eight", (String)"Four")))));
    }

}
