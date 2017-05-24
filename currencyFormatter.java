// Input Format
// A single double-precision number denoting payment.

// Constraints
// 0 <= payment <= 10^9

// Output Format
// On the first line, print US: u where  is  formatted for US currency. 
// On the second line, print India: i where  is  formatted for Indian currency. 
// On the third line, print China: c where  is  formatted for Chinese currency. 
// On the fourth line, print France: f, where  is  formatted for French currency.

// Sample Input
// 12324.134

// Sample Output
// US: $12,324.13
// India: Rs.12,324.13
// China: ￥12,324.13
// France: 12 324,13 €

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static double payment;

	private static String convertCurrency(String from, String to){
		Locale loc = new Locale(from, to);
		NumberFormat numFor = NumberFormat.getCurrencyInstance(loc);
		return numFor.format(payment);
	}

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		payment = scanner.nextDouble();
		scanner.close();

		String us = convertCurrency("en", "US");
		String india = convertCurrency("en", "IN");
		String china = convertCurrency("zh", "CN");
		String france = convertCurrency("fr", "FR");

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		SYstem.out.printlnt("France: " + france);
	}
}