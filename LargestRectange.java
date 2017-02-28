import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int building= sc.nextInt();
        int max=0;
        int temp=0;
        Integer[] height = new Integer[building];
        for(int i=0;i<building;i++) {
        height[i]=sc.nextInt();
        }
        //System.out.println("Array Ini: "+height[1]);
        for(int i=0;i<building;i++) {
            int count=1;
            for(int j =i-1;j>=0;j--){
                //System.out.println(j);
                if(height[j]>=height[i]){
                    
                    count++;
                } else break;
            }
            for(int k =i+1;k<building;k++){
                
                if(height[k]>=height[i]){
                    count++;
                } else break;
            }
            temp=height[i]*count;
            if(temp>max) max=temp;
            
        }
        System.out.println(max);
    
    }
}