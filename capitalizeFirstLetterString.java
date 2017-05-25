// Input Format
// The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

// Output Format
// There are three lines of output: 
// For the first line, sum the lengths of  and . 
// For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
// For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

// Sample Input
// hello
// java

// Sample Output
// 9
// No
// Hello Java


import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
  
        int comp = A.compareTo(B);
        if (comp > 0){System.out.println("Yes");}
        else{System.out.println("No");}
        
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1,B.length()));
        
        
        
    }
}
