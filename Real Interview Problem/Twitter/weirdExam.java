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
     * Complete the 'exam' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY v as parameter.
     */

    public static int exam(List<Integer> v){
    // Write your code here
        int optimalPosition = -1;
        int YourFriend_result = 0;

        for(int i=0; i<v.size(); i++)
        {
            if(v.get(i)==1)
                YourFriend_result++;
            else YourFriend_result--;
            
        }
        
        int yourScore = 0;

        while(yourScore <= YourFriend_result){
            optimalPosition++;
            if(v.get(optimalPosition) == 1){
                yourScore++;
                YourFriend_result--;
            } else {
                yourScore--;
                YourFriend_result++;
            }

            System.out.println("YourScore: " + yourScore + " Friend's Score: " + YourFriend_result);
        }
        
        if(optimalPosition == -1) return 0;
        return optimalPosition+1;

    }

}

public class Solution {}