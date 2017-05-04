import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int mul = scan.nextInt();
        //System.out.println(mul);
        for (int i = 1; i < 11; i++ ){
            System.out.printf("%d x %d = %d%n", mul, i, mul*i);
            
        }
    }
}
