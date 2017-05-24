// You are given an integer , you have to convert it into a string.

// Please complete the partially completed code in the editor. If your code successfully converts into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

// n can range between -100 to 100 inclusive.

// Sample Input 0
// 100

// Sample Output 0
// Good job

import java.util.*;
import java.security.*;
publklic class Solution {
	public static void main(String[] args){
		DoNotTerminate.forbidExit();
		try{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s = Integer.toString(n);

			if(n == Integer.parseInt(s)){ //parseInt: a static method to get the primitive data type of a certain string
				System.out.println("Good Job");
			}
			else{
				System.out.println("Wrong answer.");
			}
		}

		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

class DoNotTerminate{
	public static class ExitTrappedException extends securityException{
		private static final long serialVersionUID = 1;
	}

	public static void forbidExit(){
		final SecurityManager securityManager = new SecurityManager(){
			@Override
			public void checkPermission(Permission permission){
				if (permission.getName().contains("exitVM")){
					throw new ExitTrappedException();
				}
			}
		};
		
		System.setSecurityManager(securityManger);
	}
}