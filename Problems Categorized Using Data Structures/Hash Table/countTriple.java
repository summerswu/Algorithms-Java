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

public class Solution {

    static long countTriplets(List<Long> arr, long r) {
        
        Map<Long, Long> rightMap = getOccurenceMap(arr);
        Map<Long, Long> leftMap = new HashMap<>();
        long numberOfGeometricPairs = 0;
    
        for (long curr : arr) {
          long countLeft = 0;
          long countRight = 0;
          long lhs = 0;
          long rhs = curr * r;
          if (curr % r == 0) {
            lhs = curr / r;
          }
          Long occurence = rightMap.get(curr);
          rightMap.put(curr, occurence - 1L);

          if (rightMap.containsKey(rhs)) {
            countRight = rightMap.get(rhs);
          }
          if (leftMap.containsKey(lhs)) {
            countLeft = leftMap.get(lhs);
          }
          numberOfGeometricPairs += countLeft * countRight;
          insertIntoMap(leftMap, curr);
        }
        return numberOfGeometricPairs;
    }
    
    private static Map<Long, Long> getOccurenceMap(List<Long> test) {
        Map<Long, Long> occurenceMap = new HashMap<>();
        for (long val : test) {
            insertIntoMap(occurenceMap, val);
        }
       return occurenceMap;
    }
  
    private static void insertIntoMap(Map<Long, Long> occurenceMap,    Long val) {
        if (!occurenceMap.containsKey(val)) {
            occurenceMap.put(val, 1L);
          } else {
            Long occurence = occurenceMap.get(val);
            occurenceMap.put(val, occurence + 1L);
          }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}
