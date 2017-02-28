import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int total = sc.nextInt();
        String[] br = new String[total];
        
        for(int i=0;i<total;i++)
        {
            br[i] = sc.next();
            check_braces(br[i]);
        }
}
        
    
public static void check_braces(String br1)
{
Stack s1 = new Stack(); 
Boolean temp= false;    
   for(int i=0;i<br1.length();i++)
    {       
       switch(br1.charAt(i))
        {
             case '{':s1.push(br1.charAt(i));temp= false;
                    break;

             case '[': s1.push(br1.charAt(i));temp= false;
                    break;

             case '(': s1.push(br1.charAt(i));temp= false;
                    break;
            
             case ')': if(!s1.empty())
                        {
                            if((s1.peek().toString()).equals("("))
                            {
                                s1.pop();
                            }
                            else
                            {
                                   //System.out.println("NO");
                                    temp= true;
                            }
                        }
                        else{
                            //System.out.println("NO");
                            temp= true;
                       }
                    break;

              case ']':if(!s1.empty()){if((s1.peek().toString()).equals("[")){s1.pop();}
                     else
                     {
                        //System.out.println("NO");
                         temp= true;
                     }}else
                     {
                        //System.out.println("NO");
                        temp= true;
                     }
                    break;

              case '}':if(!s1.empty()){if(((s1.peek()).toString()).equals("{")){s1.pop();}
                    else{   
                            //System.out.println("NO");
                            temp= true;
                    }}else{   
                            //System.out.println("NO");
                            temp= true;
                    }
                    break;
            //default: System.out.println("NO");
                    
            }
            if(temp==true)
                {
                break;
                }
     
        }
       
            if(s1.empty() && temp==false)
                 System.out.println("YES");
            else if(temp==true || !s1.empty())
                System.out.println("NO");
    }
}