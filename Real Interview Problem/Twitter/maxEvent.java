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
     * Complete the 'maxEvents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrival
     *  2. INTEGER_ARRAY duration
     */

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {

        if(arrival.size()<2) return arrival.size();

        int ans = 1;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<arrival.size(); i++){
            ArrayList<Integer> currMeeting = new ArrayList<Integer>(Arrays.asList(arrival.get(i), (arrival.get(i)+ duration.get(i))));
            arr.add(currMeeting);
        }

        Collections.sort(arr, (a,b) -> (a.get(1)- b.get(1)));

        System.out.println(arr);

        int lastMeetingEnd = arr.get(0).get(1);

        for(int i = 1; i < arrival.size(); i++){
            if(arr.get(i).get(0) < lastMeetingEnd)continue;
            lastMeetingEnd = arr.get(i).get(1);
            ans++;
        }

        return ans;

    }

}

public class Solution {}