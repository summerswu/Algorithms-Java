import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'maximumTotalWeight' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY weights
     *  2. INTEGER_ARRAY tasks
     *  3. INTEGER p
     */

    public static int maximumTotalWeight(List<Integer> weights, List<Integer> tasks, int p) {
    // Write your code here
        int max = 0;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<weights.size(); i++){
            ArrayList<Integer> task = new ArrayList<Integer>(Arrays.asList(tasks.get(i)*2, weights.get(i)));
            arr.add(task);
        }

        int[][] memo = new int[arr.size()][p+1];

        for(int i = 0; i< memo.length;i++){
            for(int j = 0; j <memo[i].length; j++){
                if(i==0){
                    if(arr.get(i).get(0)>j) memo[i][j] = 0;
                    else memo[i][j] = arr.get(i).get(1);
                }
                else if(arr.get(i).get(0)>j){
                    memo[i][j] = memo[i-1][j];
                }
                else {
                    int process = arr.get(i).get(1) + memo[i-1][j-arr.get(i).get(0)];
                    int dontprocess = memo[i-1][j];
                    memo[i][j] = Math.max(process, dontprocess);
                }
            }
        }

        return memo[arr.size()-1][p];
    }
}

public class Solution {