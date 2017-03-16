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
        int x = 0;
        int y = 1;
        int count = 1;
        int z =0;
        if(n==0) { System.out.print(x); }
        else if( n==1 ) {System.out.print(y); }
        else {
        while(count !=n){
         z = x+y;
            x=y;
            y=z;
            count++;
        } 
            System.out.print(z);
        }
        
        
                
            
    }
}