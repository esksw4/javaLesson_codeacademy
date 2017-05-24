// You are given a date. Your task is to find what the day is on that date.

// Input Format
// A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

// Constraints
// 2000 < year < 3000

// Output Format
// Output the correct day in capital letters.

// Sample Input
// 08 05 2015

// Sample Output
// WEDNESDAY

// Explanation
// The day on August 5th 2015 was WEDNESDAY.

import java.io.*;
import java.time.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class Solution{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		int yyyy = sc.neixtInt();
		in.close();

		LocalDate dt = Localdate.of(yyyy,mm,dd);
		System.out.println(dt.getDayOfWeek());
	}
}