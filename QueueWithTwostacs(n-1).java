import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static Stack s1 = new Stack();
    private static Stack s2 = new Stack();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        int x = 0;
        while(sc.hasNext()){
            
            x = sc.nextInt();
            
            if(x ==1){
                Enqueue(sc.nextInt());
            } else if(x == 2){
                Dequeue();
            }else {
                Print();
            }
        }
    }
    
    public static void Enqueue(int data){
        
       if(s1.isEmpty() && s2.isEmpty()){
           s1.push(data);
       } else if ( s1.isEmpty()) {
           s2.push(data);
       } else{
           s1.push(data);
       }
        
        
    }
    
    public static void Dequeue(){
        //stackExchange();
        if(s1.isEmpty()){
            while(s2.size() != 1)
                s1.push(s2.pop());
            
            s2.pop();
            
            while(!s1.isEmpty())
                s2.push(s1.pop());
            
        } else {
            while(s1.size() != 1)
                s2.push(s1.pop());
            
            s1.pop();
            
            while(!s2.isEmpty())
                s1.push(s2.pop());
        }
        //stackExchange();
    }
    
    public static void stackExchange(){
       
        
            if(!s1.isEmpty()){
               
            while(!s1.isEmpty()){
                
                s2.push(s1.pop());
            }
            
        }
        else if(!s2.isEmpty()){
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        } else  if(s1.isEmpty() && s2.isEmpty()) {
      
            return;
        }
            
    }
    
    public static void Print(){
        //stackExchange();
        if(s1.isEmpty()){
            while(s2.size() != 1)
                s1.push(s2.pop());
            
           System.out.println( s2.peek());
            
            while(!s1.isEmpty())
                s2.push(s1.pop());
            
        } else {
            while(s1.size() != 1)
                s2.push(s1.pop());
            
            System.out.println( s1.peek());
            
            while(!s2.isEmpty())
                s1.push(s2.pop());
        }
        //stackExchange();
    }
    
    
}