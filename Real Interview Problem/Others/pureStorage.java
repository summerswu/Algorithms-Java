import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the compute_number_score function below.
    static int compute_number_score(int number) {
        int score = 0;

        if(number%5==0) score += 6;

        int counter = 0;

        boolean lastThree = false;

        int n = 1;

        int lastInt = number%10;

        while(number != 0){
            if(lastInt == (number%10)+1)
            {
                n++;
                System.out.println("activated");
            }
            else{
                score += (n*n);
                n = 1;
            }
            if(number%10 == 5) score+=2;
            if((number%10)%2 != 0) score += 1;
            if(number%10 == 3){
                if(lastThree == true)
                    score += 4;
                lastThree = true;
            } else 
                lastThree = false;
            lastInt = number%10;
            number = number/10;
            counter++;
            System.out.println(lastInt);
        }
        return score;
    }

    public static void main(String[] args) throws IOException {