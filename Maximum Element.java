import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> max = new Stack<Integer>();
        int inputs = sc.nextInt();
        int poppedEl = 0;
        for(int i =0; i <inputs;i++){
            int query = sc.nextInt();
            
            if(query == 1) {
                int nextVal = sc.nextInt();
                stack.push(nextVal);
                //if(max.isEmpty()){max.push()}
                //if(!max.isEmpty()){}
                if(max.isEmpty() || max.peek()<=nextVal) 
                    max.push(nextVal);
            }
            else if(query ==2) {
                if(stack.size()!=0 ) 
                    poppedEl = stack.pop(); 
                else System.out.println("Error");
                
                if(!max.isEmpty()) {
                    if(max.peek() == poppedEl) 
                    max.pop();
                }
            }
            else if(query==3) System.out.println(max.peek());
                
        }
    }
  /*  public static int findMax(Stack<Integer> stack){
        int max = Integer.MIN_VALUE;
        int temp=0;
        //System.out.println(stack);
        
        Iterator iter = stack.iterator();
        
        
        while(iter.hasNext()) {
            temp=(Integer)iter.next();
          //  System.out.println(temp + " "+ max);
        if(temp>=max)
            max=temp;
        }
        return max;
    }*/
}