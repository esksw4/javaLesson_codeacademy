import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

        for (Integer i : a){
            tempArrayList.add(i);
        }
        
        int temp;
        for (int j=0; j < k; j++){
            temp = tempArrayList.remove(0);
            tempArrayList.add(temp);
        }
        
        for (int j=0; j < tempArrayList.size(); j++){
            System.out.print(tempArrayList.get(j) + " ");
        }
        
    }
}