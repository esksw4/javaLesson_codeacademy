// Given a string, find out the lexicographically smallest and largest substring of length .
// Input Format
// First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

// Output Format
// In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

// Sample Input
// welcometojava
// 3

// Sample Output
// ava
// wel

import java.io.*;
import java.util.*;

public class Solution {
    private static String getMin(String A, String min){
        if ((min.compareTo(A)) > 0){ // A is less than min;
                min = A;
        }
        return min;
    }
    
     private static String getMax(String A, String max){
        if ((A.compareTo(max)) > 0){ // A is bigger than max;
                max = A;                
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int leng = sc.nextInt();
        String min = words.substring(0, leng);
        String max = min;
        
        for (int i = 1; i < words.length() - leng + 1; i++){
            //System.out.println(i);
            String A = words.substring(i, i+leng);
            min = getMin(A, min);
            max = getMax(A, max);
        }
        
        System.out.println(min);
        System.out.println(max);

    }
}