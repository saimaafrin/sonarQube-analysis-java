import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // We have an array array list 'arr' of N integers arr[1], arr[2], ..., arr[N].The
    // numbers in the array array list will be randomly ordered. Your task is to determine if
    // it is possible to get an array array list sorted in non-decreasing order by performing 
    // the following operation on the given array array list:
    // You are allowed to perform right shift operation any number of times.
    // One right shift operation means shifting all elements of the array array list by one
    // position in the right direction. The last element of the array array list will be moved to
    // the starting position in the array array list i.e. 0th index. 
    // If it is possible to obtain the sorted array array list by performing the above operation
    // then return true else return false.
    // If the given array array list is empty then return true.
    // Note: The given array list is guaranteed to have unique elements.
    // For Example:
    // >>> moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)1l, (long)2l))))
    // (true)
    // Explanation: By performin 2 right shift operations, non-decreasing order can
    // be achieved for the given array array list.
    // >>> moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)4l, (long)1l, (long)2l))))
    // (false)
    // Explanation:It is not possible to get non-decreasing order for the given
    // array array list by performing any number of right shift operations.
    public static boolean moveOneBall(ArrayList<Long> arr) {

        // Your code here
        // This solution uses the Longest Increasing Subsequence (LIS)
        // https://en.wikipedia.org/wiki/Longest_increasing_subsequence
        // to find the maximum number of balls that can be moved to the right
        // without violating the non-decreasing order.
        // The solution also takes advantage of the fact that the given array
        // has unique elements.
        // The time complexity is O(N log N) and the space complexity is O(N)
        // where N is the length of the array.
        int N = arr.size();
        // Return true if the array has 0 or 1 elements
        if (N <= 1) {
            return true;
        }
        // dp[i] = the longest increasing subsequence that ends at the i-th index
        int[] dp = new int[N];
        dp[0] = 1;
        // parent[i] = the index of the parent element of the i-th element
        int[] parent = new int[N];
        parent[0] = -1;
        for (int i = 1; i < N; i++) {
            // Initialize dp[i] to 1
            dp[i] = 1;
            // Initialize the parent of the i-th element to -1
            parent[i] = -1;
            for (int j = 0; j < i; j++) {
                // If the j-th element is less than the i-th element and
                // the length of the longest increasing subsequence that
                // ends at the j-th index is longer than the length of the
                // current longest increasing subsequence that ends at the
                // i-th index, then update the current longest increasing
                // subsequence that ends at the i-th index
                if (arr.get(j) < arr.get(i) && dp[j] >= dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
        }
        // Find the maximum number of balls that can be moved to the right
        // without violating the non-decreasing order
        int maxBalls = 0;
        for (int i = 0
    }
    public static void main(String[] args) {
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)1l, (long)2l)))) == (true));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)10l, (long)1l, (long)2l)))) == (true));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)1l, (long)2l)))) == (false));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)4l, (long)1l, (long)2l)))) == (false));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList()))) == (true));
    }

}
