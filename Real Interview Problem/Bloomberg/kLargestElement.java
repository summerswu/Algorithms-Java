import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        System.out.println("Hello World");
    } 
    
    //two functions
    //atTrade what trading is happening right now
    //what is the most traded stock
    //cotinuls, hashmap total amount of shares 
    //
} 

class StockLedger{
    
    HashMap<String, Integer> pastTrades = new HashMap<String, Integer>();//initiaite hashmap for the ledger
    //initiate a minHeap of integers, call it maxX
    
    public void addTrade(String ticker, int sharesTraded){
        
        if(pastTrades.containsKey(ticker)){
            pastTrades.put(ticker, pastTrades.get(ticker) + sharesTraded);
        }
        
        pastTrades.putIfAbsent(ticker, sharesTraded);
    }//atTrade
    
    public void printMaxShares(){
        
        int maxShares = 0;
        String maxTicker = "";
        
        if(pastTrades.isEmpty()){
            System.out.println("No past trades in ledger");
            return;
        }
        
        for(Map.Entry element: pastTrades.entrySet()){
            if((int)element.getValue() > maxShares){
                maxShares = (int)element.getValue();
                maxTicker = (String)element.getKey();
            }
            //add shares number to the minheap
            //if minheap size > k, pop one element
        }
        
        System.out.println(maxTicker, maxShares);
        
        //for each element in the heap
            //remove element from the heap and print it out
        
    }//printMaxShares
}


MSFT 400
IBM 1000
AAPL 500
AAPL 600
NFLX 1000
AMZN 700
GOGL 300

AAPL 1100
NFLX 1000