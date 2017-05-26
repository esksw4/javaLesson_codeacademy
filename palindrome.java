// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
// Given a string , print Yes if it is a palindrome, print No otherwise.

// Constraints
// A will consist at most  lower case english letters.

// Sample Input
// madam

// Sample Output
// Yes

import java.io.*;
import java.util.*;

public class Solution {
    
    private static String findPalin(String A){
        int left = 0;
        int right = A.length() - 1;
        
        if (right + 1 == 0){
            return "No";
        }
        while (left < right){
            if (A.charAt(left) != A.charAt(right)){ return "No";}
            left++;
            right--;
        }
        return "Yes";
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String result = findPalin(A);
        System.out.println(result);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
