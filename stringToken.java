// Sample Input
// He is a very very good boy, isn't he?

// sample output
//10
// He
// is
// a
// very
// very
// good
// boy
// isn
// t
// he

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s," !,?._'@"); 
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {  
            System.out.println(st.nextToken());  
        }  
        scan.close();
    }
}
