import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        Stack<Integer> s = new Stack<Integer>();
        while(sc.hasNextInt())
            s.push(sc.nextInt());
        if(n > s.size()) {
          System.out.println("NIL");
            return;
        } 
        while(count != n){
            s.pop();
            count++;
        }
        System.out.println(s.pop());
    }
}