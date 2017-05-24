// Input Format
// There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

// Constraints
// -100 <= B <= 100   but B or H must not be 0.
// -100 <= H <= 100

// Output Format
// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

// Sample input 1
// 1
// 3

// Sample output 1
// 3

// Sample input 2
// -1
// 2

// Sample output 2
// java.lang.Exception: Breadth and height must be positive

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	static int B;
	static int H;
	static boolean flag;

	static {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			B = sc.nextInt();
			H = sc.nextInt();
		}
		flag = true;

		if (B <= 0 || B > 100 || H <= 0 || H > 100){
			flag = false;
			System.out.printlnt("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] arg){
		if (flag){
			int area = B*H;
			System.out.println(area);
		}
	}
}

