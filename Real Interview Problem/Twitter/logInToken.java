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
     * Complete the 'numberOfTokens' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER expiryLimit
     *  2. 2D_INTEGER_ARRAY commands
     */

    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {
    // Write your code here
        HashMap<Integer, Integer> tokens= new HashMap<Integer, Integer>();

        for(int i = 0; i < commands.size(); i++){
            List<Integer> request = commands.get(i);
            if(request.get(0) == 0) tokens.putIfAbsent(request.get(1), request.get(2)+expiryLimit);

            if(request.get(0) == 1 && tokens.containsKey(request.get(1))){
                if(tokens.get(request.get(1)) < request.get(2))
                {
                    tokens.remove(request.get(1));
                    continue;
                } 
                else tokens.put(request.get(1), request.get(2)+expiryLimit);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = tokens.entrySet().iterator(); 
        
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next(); 
            if(entry.getValue()< commands.get(commands.size()-1).get(2)) iterator.remove();
        }

        return tokens.size();
    }

}

public class Solution{}