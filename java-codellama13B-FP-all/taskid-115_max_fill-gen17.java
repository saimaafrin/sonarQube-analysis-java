import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a rectangular grid of wells. Each row represents a single well,
    // and each 1 in a row represents a single unit of water.
    // Each well has a corresponding bucket that can be used to extract water from it, 
    // and all buckets have the same capacity.
    // Your task is to use the buckets to empty the wells.
    // Output the number of times you need to lower the buckets.
    // Example 1:
    // >>> maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (1l))
    // (6l)
    // Example 2:
    // >>> maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)1l, (long)1l))))), (2l))
    // (5l)
    // Example 3:
    // >>> maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l))))), (5l))
    // (0l)
    // Constraints:
    // * all wells have the same length
    // * 1 <= grid.length <= 10^2
    // * 1 <= grid[:,1].length <= 10^2
    // * grid[i][j] -> 0 | 1
    // * 1 <= capacity <= 10
    public static long maxFill(ArrayList<ArrayList<Long>> grid, long capacity) {

        long n = grid.size();
        long m = grid.get(0).size();
        long[][] dp = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid.get(i).get(j) == 0)
                    continue;
                if (i == 0 && j == 0)
                    dp[i][j] = grid.get(i).get(j);
                else {
                    if (i - 1 >= 0)
                        dp[i][j] += dp[i - 1][j];
                    if (j - 1 >= 0)
                        dp[i][j] += dp[i][j - 1];
                    dp[i][j] -= dp[i - 1][j - 1];
                    dp[i][j] = Math.max(dp[i][j], 0);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] > capacity
    }
    public static void main(String[] args) {
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (1l)) == (6l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)1l, (long)1l))))), (2l)) == (5l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l))))), (5l)) == (0l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (2l)) == (4l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (9l)) == (2l));
    }

}
